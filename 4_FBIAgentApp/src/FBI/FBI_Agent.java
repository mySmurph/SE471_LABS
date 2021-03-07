package FBI;

import AgentDemo.Agent_IF;

public class FBI_Agent implements Runnable, Agent_IF {

	/**
	 * is the agent currently working
	 */
	private boolean workingInProgress;
	
	/**
	 * foot print based of special character and instance number
	 */
	private String myFootPrint;
	
	/**
	 * not sure what this is for
	 */
	private int taskID = -1;
	
	/**
	 * constructor
	 * @param footPrint special character used to help distinguish agent footprint
	 */
	public FBI_Agent(String footPrint) {
			int at = this.toString().indexOf("@")+1;
			String intanceID = this.toString().substring(at);
		this.myFootPrint = String.format("FBI - %s%s%s%s%s", footPrint, footPrint, intanceID, footPrint, footPrint);
	}

	/**
	 * start the process of working on a task
	 */
	@Override
	public void startTask() {
		System.out.printf("%-15s -> %10s %d\n", myFootPrint, "Start Task", taskID);
		this.workingInProgress = true;
	}

	/**
	 * finish up working on a task
	 */
	@Override
	public void stopTask() {
		this.workingInProgress = false;
		System.out.printf("%-15s -> %10s %d\n", myFootPrint, "End Task", taskID);
		this.taskID = -1;
	}

	/**
	 * give the agent a dedicated task
	 * @param the task id that the agent is to work on
	 */
	@Override
	public void setTaskID(int id) {
		this.taskID = id;
	}

	/**
	 * while running the agent process a task if they have one.
	 */
	@Override
	public void run() {
		while(true) {
			try {
				if(workingInProgress) {
					processing();
					Thread.sleep(100);
				}else {
					Thread.sleep(500);
				}
			} catch (InterruptedException e) {
				System.out.println(this.getClass().getName());
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * prints a message of what is bing processed
	 */
	private void processing() {
		System.out.printf("%20s is working on task %d\n", myFootPrint, taskID);
	}

}
