//Decision.java
package src.Actions;

import src.Personel.CEO;
import src.Personel.Manager;

public abstract class Decision {

	/**
	 * the manager that suggested the plan
	 */
	protected Manager suggestedBy;

	/**
	 * the priority level
	 */
	protected int priority;

	/**
	 * the hazard that is to be resolved by this plan
	 */
	protected Hazard hazard;

	/**
	 * constructor
	 * @param suggestedBy
	 * @param priority
	 * @param hazard
	 */
	public Decision(Manager suggestedBy, int priority, Hazard hazard) {
		this.suggestedBy = suggestedBy;
		this.priority = priority;
		this.hazard = hazard;
	}

	/**
	 * execute this plan
	 * @param commander
	 */
	public abstract void execute(CEO commander);

	/**
	 * get the priority of this decision
	 * @return
	 */
	public int getPriority() {
		return priority;
	}
}
