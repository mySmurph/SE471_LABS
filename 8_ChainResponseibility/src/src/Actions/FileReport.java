//FileReport.java
package src.Actions;

import src.Personel.CEO;
import src.Personel.Manager;

public class FileReport extends Decision{
	/**
	 * constructor
	 *
	 * @param suggestedBy
	 * @param priority
	 * @param hazard
	 */
	public FileReport(Manager suggestedBy, int priority, Hazard hazard) {
		super(suggestedBy, priority, hazard);
	}

	/**
	 * execute this plan
	 *
	 * @param commander
	 */
	@Override
	public void execute(CEO commander) {
		System.out.printf("Execute File Report: suggested by %s for %s\n", suggestedBy.getName(), hazard.toString());
		commander.report();
	}
}
