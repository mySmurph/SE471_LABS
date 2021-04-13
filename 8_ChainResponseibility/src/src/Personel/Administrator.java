package src.Personel;

import src.Actions.Hazard;

import java.util.ArrayList;
import java.util.List;

public abstract class Administrator extends Employee{
	/**
	 * this admin's direct employee's
	 */
	protected List<Employee> members;

	/**
	 * constructor
	 * @param name
	 */
	public Administrator(String name) {
		super(name);
		members = new ArrayList<Employee>();
	}

	public void addMember(Employee newTeamMember){
		members.add(newTeamMember);
	}


	/**
	 * Supervisor - tell all his team members to perform fixIt() and also inform their overseer(manager)
	 * Manager -   handle the danger by asking feedbacks from all supervisors/leaders under his management
	 *             and contacting the CEO in case the feedbacks are all positive(T)
	 * CEO -       collect suggested decisions from the managers who performed their suggestDecisions method
	 * @param reporter
	 * @param hazard
	 */
	@Override
	public abstract void seeDanger(IReporterHazard reporter, Hazard hazard);

	/**
	 * Evacuates all members, then evacuates self
	 */
	@Override
	public void evacuate() {
		System.out.println("Evacuating members first ... ");
		for(Employee e: members){
			e.evacuate();
		}
		System.out.println(name + " has evacuated now that their members have evacuated.");
	}
}
