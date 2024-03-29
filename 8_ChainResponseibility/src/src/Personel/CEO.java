//CEO.java
package src.Personel;

import src.Actions.Decision;
import src.Actions.Hazard;

import java.util.ArrayList;
import java.util.List;

public class CEO extends Administrator{
	/**
	 * constructor
	 *
	 * @param name
	 */
	public CEO(String name) {
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
		//collect suggestions
		List<Decision> gatheredDS = new ArrayList<>();
		for(Employee admin: members){
			if(admin instanceof Manager)
				gatheredDS.addAll(((Manager)admin).suggestDecisions(hazard));
		}
		implementDecision(gatheredDS);
	}

	/**
	 * given a list of decisions, order the list by priority
	 * @param ds a list of Decisions
	 * @return an ordered list of Decisions
	 */
	private List<Decision> sortByPriority(List<Decision> ds){
		List<Decision> orderedDS = new ArrayList<>();
		while(!ds.isEmpty()){
			Decision topPriority = ds.remove(0);
			for (Decision d: ds){
				if(d.getPriority() > topPriority.getPriority())
					topPriority = d;
			}
			orderedDS.add(topPriority);
		}
		return orderedDS;
	}

	/**
	 * given a list of decision the CEO sorts through them and executes some of the decisions
	 * @param ds a list of decisions
	 */
	public void implementDecision(List<Decision> ds){
		ds = sortByPriority(ds);
		int dsToBeExecuted = 2;
		while (!ds.isEmpty() && dsToBeExecuted-- > 0)
			ds.remove(0).execute(this);
	}

	public void report(){
		System.out.println("The city’s environmental department is notified");
	}
}
