package AgentDemo;

import PoolPattern.ObjectCreation_IF;

public class FBI_Agent_Creator implements ObjectCreation_IF {

	/**
	 * array if special characters
	 */
	private String[] footPrints = {"FBI-@", "FIB-#", "FBI-$", "FBI-*", "FBI-.", "FBI-?"};
	
	/**
	 * index
	 */
	private int index;
	

	@Override
	public Object create() {
		FBI_Agent agent = null;
		if(index < this.footPrints.length) {
			new FBI_Agent(this.footPrints[index++]);
			new Thread(agent).start();
		}
		return agent;
	}

}
