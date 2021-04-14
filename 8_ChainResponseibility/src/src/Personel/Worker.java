package src.Personel;

import src.Actions.Hazard;

import java.util.Scanner;

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
	public void seeDanger(IReporterHazard reporter, Hazard hazard)
	{
		String type;
		String Description;
		int level;

		Scanner sc = new Scanner(System.in);
		System.out.println("What type of Hazard is this");
		type = sc.nextLine();

		System.out.println("How would you describe said Hazard?");
		Description = sc.nextLine();

		System.out.println("On a scale from 1 - 10, How dangerous is this Hazard?");
		level = sc.nextInt();

		Hazard h = new Hazard(type, Description, level);
		hazard = h;

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
