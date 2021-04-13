package src.Personel;

import src.Actions.Hazard;

public abstract class DirectAdministrator extends Administrator{

	private final int HAZARD_LEVEL_THRESHOLD = 5;
	/**
	 * constructor
	 *
	 * @param name
	 */
	public DirectAdministrator(String name) {
		super(name);
	}

	/**
	 * Each supervisor or leader object has a “boolean getFeedback()” method, displaying “Feedback by [name]”
	 * @return true if the hazard needs to be reported to the upper level of administration
	 */
	public boolean getFeedBack(Hazard hazard){
		boolean feedback = hazard.getHazard_level() >= HAZARD_LEVEL_THRESHOLD;
		System.out.printf("Feedback from %s is %b", name, feedback);
		return feedback;
	}

	/**
	 * Supervisor - tell all his team members to perform fixIt() and also inform their overseer(manager)
	 * Manager -   handle the danger by asking feedbacks from all supervisors/leaders under his management
	 * and contacting the CEO in case the feedbacks are all positive(T)
	 * CEO -       collect suggested decisions from the managers who performed their suggestDecisions method
	 *
	 * @param reporter
	 * @param hazard
	 */
	@Override
	public void seeDanger(IReporterHazard reporter, Hazard hazard) {
		System.out.printf("%s instructs team members to fix %s\n", name, hazard.toString());
		for(Employee e: members){
			if(e instanceof Worker){
				((Worker)e).fixIt(hazard);
			}
		}
		overseer.seeDanger(reporter, hazard);
	}
}
