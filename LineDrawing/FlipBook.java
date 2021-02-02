package LineDrawing;

public class FlipBook implements Runnable{
	private LiningPanel sketch;
	private boolean stopped;

	public FlipBook(LiningPanel panelToBeSketched){
		sketch = panelToBeSketched;
		stopped = false;
	}
	public boolean isStopped() {
		return stopped;
	}

	public void setStopped(boolean stopped) {
		this.stopped = stopped;
	}

	@Override
	public void run() {
		while(true){
			if(!stopped){
				sketch.moreLines();
				sketch.repaint();
			}
			try {
				Thread.sleep(22);
			} catch (Exception e) {}
		}
	}
}