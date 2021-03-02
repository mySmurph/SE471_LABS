package AgentDemo;

import PoolPattern.ObjectPool;

public class TaskRequester implements Runnable {

	private ObjectPool server;
//	private int[] taskQueue;
	public TaskRequester(ObjectPool p) {
		this.server = p;
//		this.taskQueue = new int[]{111, 211, 231, 311, 351, 443, 446, 370, 451, 461, 471, 481};
		
	}

	@Override
	public void run() {
//		int i = 0;
		Agent_IF agent;
		try {
			agent = (Agent_IF) server.waitForObject();
//			agent.setTaskID(this.taskQueue[(i++)%this.taskQueue.length]);
//			agent.setTaskID((int)Math.random() * 10000);
			agent.startTask();
			try {
				Thread.sleep((long) (Math.random() * 2000));
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
