package src.Personel;

import src.Actions.Hazard;

import java.util.ArrayList;
import java.util.List;

public abstract class Administrator extends Employee{
	/**
	 * this admin's direct employee's
	 */
	private List<Employee> members;

	/**
	 * constructor
	 * @param name
	 */
	public Administrator(String name) {
		super(name);
		members = new ArrayList<Employee>();
	}


	@Override
	public abstract void seeDanger(IReporterHazard reporter, Hazard hazard);

	@Override
	public void evacuate() {
		System.out.println("Evacuating members first ... ");
		for(Employee e: members){
			e.evacuate();
		}
		System.out.println(name + " has evacuated now that their members have evacuated.");
	}
}
