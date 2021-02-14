package LineDrawing;

public class FlipBook implements Runnable{
	private LiningPanel sketch;
	private boolean stopped;

	/**
	 * constructor
	 * @param panelToBeSketched
	 * the Jpanel object
	 */
	public FlipBook(LiningPanel panelToBeSketched){
		sketch = panelToBeSketched;
		stopped = false;
	}

	/**
	 * see if the FlipBook animation is running or stopped
	 * @return stopped
	 * 		true = the FlipBook animation is NOT running
	 * 		false = the FlipBook animation IS running
	 */
	public boolean isStopped() {
		return stopped;
	}

	/**
	 * indicate to stop or run the FlipBook animation
	 * @param stopped
	 * 		true = STOP the FlipBook animation
	 * 		false = RESUME the FlipBook animation
	 */
	public void setStopped(boolean stopped) {
		this.stopped = stopped;
	}

	/**
	 *  runs the FlipBook animation
	 */
	@Override
	public void run() {
		while(true){
			if(!stopped){
				sketch.moreLines();
				sketch.repaint();
			}
			try {
				Thread.sleep(125);
			} catch (Exception e) {}
		}
	}
}