package AgentDemo;

public class FBI_Agent implements Runnable, Agent_IF {

	/**
	 * is the agent currently working
	 */
	private boolean workingInProgress;
	
	/**
	 * foot print
	 */
	private String myFootPrint;
	
	private int taskID;
	
	
	public FBI_Agent(String footPrint) {
		this.taskID = -1;
			int at = this.toString().indexOf("@")+1;
			String intanceID = this.toString().substring(at);
		this.myFootPrint = String.format("%s%s%s%s%s", footPrint, footPrint, intanceID, footPrint, footPrint);
	}

	@Override
	public void startTask() {
		System.out.printf("%-15s -> %10s %d\n", myFootPrint, "Start Task", taskID);
		this.workingInProgress = true;
	}

	@Override
	public void stopTask() {
		this.workingInProgress = false;
		System.out.printf("%-15s -> %10s %d\n", myFootPrint, "End Task", taskID);
		this.taskID = -1;
	}

	@Override
	public void setTaskID(int id) {
		this.taskID = id;

	}

	@Override
	public void run() {
		while(true) {
			try {
				if(workingInProgress) {
					System.out.printf("%20s\n", myFootPrint);
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
	
	private void processing() {

	}

}
