package src.Personel;

import src.Actions.Decision;
import src.Actions.Evacuation;
import src.Actions.FileReport;
import src.Actions.Hazard;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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

		if(tellCEO && overseer != null)
			overseer.seeDanger(this, hazard);
	}

	/**
	 * ask the manager to comme up with some suggestions
	 * @param hazard
	 * @return List<Decision> this managers suggested decisions
	 */
	public List<Decision> suggestDecisions(Hazard hazard){
		List<Decision> mySuggestions = new ArrayList<>();

		Scanner choice = new Scanner(System.in);
		System.out.printf("Manager %s, please suggest some decisions to the CEO regarding %s.\n", name, hazard.toString());
		do {
			System.out.println("Does the area need to be evacuated?\n\t[Yes] - Evacuate the area\n\t[No] - File an incident report");
			boolean shouldEvacuate = choice.next().toLowerCase(Locale.ROOT).indexOf('y') >= 0;

			System.out.printf("How urgent %s on a scale from 1(low) - 10(high)? ", shouldEvacuate ? "is evacuating the area" : "does a report need to be filed");
			int priority = choice.nextInt();

			mySuggestions.add(shouldEvacuate ? new Evacuation(this, priority, hazard) : new FileReport(this, priority, hazard));

			System.out.println("Would you like to make an alternate suggestion?\n\t[1] - Suggestion another decision\n\t[ANY] - Done");
		}while(choice.nextInt()==1);
		System.out.println("Your suggestions have been recorded.");

		return mySuggestions;
	}
}
