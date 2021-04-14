package src.Personel;

import src.Actions.Decision;
import src.Actions.Hazard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager extends Administrator{
	/**
	 * constructor
	 *
	 * @param name
	 */
	public Manager(String name) {
		super(name);
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
		//ask for feedback
		boolean tellCEO = true;
		for(Employee e: members){
			if(e instanceof Supervisor){
				tellCEO = tellCEO && ((Supervisor)e).getFeedBack(hazard);
			}
			if(!tellCEO)
				break;
		}

		if(tellCEO)
			overseer.seeDanger(this, hazard);
		//contact CEO

	}

	/**
	 *
	 * @param hazard
	 * @return List<Decision>
	 */
	public List<Decision> suggestDecisions(Hazard hazard){
		List<Decision> mySuggestions = new ArrayList<>();

		Scanner choice = new Scanner(System.in);
		System.out.println("How big of a problem from 1 - 10 is this issue?");
		int Priority = choice.nextInt();

		//We can have user input HOWEVER MySuggestions is an array list of ABSTRACT Decisions
		//THose consist of Manager, Priority, and Hazard
		//Decisions however CANT be instantiated

		/*Decision Dec = new Decision(this, Priority, hazard);

		mySuggestions.add(Dec);*/

		return mySuggestions;
	}


}
