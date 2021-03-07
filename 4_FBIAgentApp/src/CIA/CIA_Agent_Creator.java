package CIA;

import PoolPattern.ObjectCreation_IF;

public class CIA_Agent_Creator implements ObjectCreation_IF {

	/**
	 * array if special characters
	 */
	private String[] footPrints = {"@", "#", "$", "*", ".", "?"};
	
	/**
	 * index
	 */
	private int index = 0;
	
	/**
	 * creates and returns a new CIA Agent with a unique footprint
	 * @return the CIA Agent
	 */
	@Override
	public Object create() {
		CIA_Agent agent = new CIA_Agent(this.footPrints[(index++)%footPrints.length]);
		new Thread(agent).start();
		return agent;
	}

}
