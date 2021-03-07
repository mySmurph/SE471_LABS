package AgentDemo;

import PoolPattern.ObjectPool;

public class TaskRequester implements Runnable {

	/**
	 * Singlton object pool
	 */
	private ObjectPool server;
	
	/**
	 * constructor
	 * @param p the Object pool that we are allowed to request service providers from
	 */
	public TaskRequester(ObjectPool p) {
		this.server = p;
	}

	/**
	 * On run we get an available agent from the service pool, then
	 * the agent start working on a task for an amount of time.
	 * When time is up the agent stops working on the task and the agent is returned to the service pool.
	 */
	@Override
	public void run() {
		Agent_IF agent;
		try {
			agent = (Agent_IF) server.waitForObject();
			agent.setTaskID(server.getNextTask());
			agent.startTask();
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				System.out.println(this.getClass().getName());
				e.printStackTrace();
			}
			agent.stopTask();
			server.release(agent);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}
