package AgentDemo;

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
	

	@Override
	public Object create() {
		FBI_Agent agent = new FBI_Agent(this.footPrints[(index++)%footPrints.length]);
		new Thread(agent).start();
		return agent;
	}

}
