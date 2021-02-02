package LineDrawing;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class LiningPanel extends javax.swing.JPanel{
	/**
	 * const LIMIT
	 * the upper limit of the nmber of lines to be drawn
	 */
	private static final double LIMIT = 15.0;

	/**
	 * the current number of lines to be drawn
	 */
	private int lines;

	/**
	 * array<Color>
	 */
	private Color rgbColor[];

	/**
	 * Constructor
	 */
	public LiningPanel() {
		lines = 0;
		rgbColor = new Color[(int)LIMIT+1];
		newRandomColor();
	}

	/**
	 * incriments the number of lines to be drawn, resets when the limit is hit
	 * invokes newRandomColor()
	 */
	public void moreLines(){
		lines = (int)((++lines)%(LIMIT+1.0));
		newRandomColor();
	}

	/**
	 * makes a new color at the index of lines
	 */
	private void newRandomColor(){
		Random random = new Random();
		int red = random.nextInt(255);
		int green = random.nextInt(255);
		int blue = random.nextInt(255);
		rgbColor[lines] = new Color(red, green, blue);
	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int w = getWidth();
		int h = getHeight();

		for(int i = 0; i < lines; i++)
		{
			int w2 = (int)((i/LIMIT)*w); 
			int h2 = (int)((i/LIMIT)*h); 
			
		//d.	Add random colors to the lines 
			g.setColor(rgbColor[i]);

		// c.	Modify the code to mirror the design in all four corners, as shown in the figure below	
		//	g.drawLine(x1, y1, x2, y2) <-- order of lines
			g.drawLine(0,  h2, w2, h);
			g.drawLine(w2,  h, w, h-h2);
			g.drawLine(w,  h-h2, w-w2, 0);
			g.drawLine(w-w2, 0, 0, h2);
		}
	}
}

