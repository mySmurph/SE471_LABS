package FBI;

import PoolPattern.ObjectCreation_IF;

public class FBI_Agent_Creator implements ObjectCreation_IF {

	/**
	 * array if special characters
	 */
	private String[] footPrints = {"@", "#", "$", "*", ".", "?"};
	
	/**
	 * index
	 */
	private int index = 0;
	
	/**
	 * creates and returns a new FBI Agent with a unique footprint
	 * @return the FBI Agent
	 */
	@Override
	public Object create() {
		FBI_Agent agent = new FBI_Agent(this.footPrints[(index++)%footPrints.length]);
		new Thread(agent).start();
		return agent;
	}

}
