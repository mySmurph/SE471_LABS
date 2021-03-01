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
	
	public FBI_Agent(String footPrint) {
		this.myFootPrint = footPrint;
	}

	@Override
	public void startTask() {
		this.workingInProgress = true;

	}

	@Override
	public void stopTask() {
		this.workingInProgress = false;

	}

	@Override
	public void setTaskID(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		while(true) {
			if(workingInProgress) {
				sleep(100);
				System.out.println(myFootPrint);
			}else {
				sleep(500);
			}
		}

	}
	
	private void processing() {
		// TODO Auto-generated method stub
	}

}
