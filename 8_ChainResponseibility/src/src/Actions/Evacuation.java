package src.Actions;

import src.Personel.CEO;
import src.Personel.Manager;

public class Evacuation extends Decision{
	/**
	 * constructor
	 *
	 * @param suggestedBy
	 * @param priority
	 * @param hazard
	 */
	public Evacuation(Manager suggestedBy, int priority, Hazard hazard) {
		super(suggestedBy, priority, hazard);
	}

	/**
	 * execute this plan
	 *
	 * @param commander
	 */
	@Override
	public void execute(CEO commander) {
		System.out.printf("Execute Evacuation Plan: suggested by %s for %s\n", suggestedBy.getName(), hazard.toString());
		commander.evacuate();
	}
}
