package src.Personel;

import src.Actions.Decision;
import src.Actions.Hazard;

import java.util.ArrayList;
import java.util.List;

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

		//contact CEO
	}

	/**
	 *
	 * @param hazard
	 * @return List<Decision>
	 */
	public List<Decision> suggestDecisions(Hazard hazard){
		List<Decision> mySuggestions = new ArrayList<>();



		return mySuggestions;
	}


}
