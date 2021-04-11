package src.Personel;

import src.Actions.Hazard;

public class Worker extends Employee{
	public Worker(String name) {
		super(name);
	}

	/**
	 * Worker -    triggered the method [seeDanger] to report hazard to his overseer(supervisor)
	 * @param reporter
	 * @param hazard
	 */
	@Override
	public void seeDanger(IReporterHazard reporter, Hazard hazard) {
		overseer.seeDanger(this, hazard);
	}

	/**
	 * Announce that this worker has evacuated.
	 */
	@Override
	public void evacuate() {
		System.out.println(name + " has been evacuated." );
	}

	/**
	 * Announce that this worker is fixing the hazard
	 * @param hazard the hazard being fixed
	 */
	public void fixIt(Hazard hazard){
		System.out.printf(" -> %s is fixing %s.\n", name, hazard.toString());
	}
}
