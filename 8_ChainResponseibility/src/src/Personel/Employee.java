package src.Personel;

import src.Actions.Hazard;

public abstract class Employee implements IReporterHazard
{
	/**
	 * employee name
	 */
	protected String name;

	/**
	 * employee's boss (direct overseer)
	 */
	protected Administrator overseer;

	public Employee(String name) {
		this.name = name;
	}

	/**
	 * Worker -    triggered the method to report hazard to his overseer(supervisor)
	 * Supervisor - tell all his team members to perform fixIt() and also inform their overseer(manager)
	 * Manager -   handle the danger by asking feedbacks from all supervisors/leaders under his management
	 *             and contacting the CEO in case the feedbacks are all positive(T)
	 * CEO -       collect suggested decisions from the managers who performed their suggestDecisions method
	 * @param reporter
	 * @param hazard
	 */
	public abstract void seeDanger(IReporterHazard reporter, Hazard hazard);

	/**
	 *   leave the immediate area
	 */
	public abstract void evacuate();

	/**
	 * set this employee's direct overseer
	 * @param director boss
	 */
	public void setDirectOverseer(IReporterHazard director){
		this.overseer = (Administrator)director;
	}

	/**
	 * get this employee's direct overseer
	 * @return IReporterHazard - boss
	 */
	public IReporterHazard getDirectOverseer(){
		return overseer;
	}
}
