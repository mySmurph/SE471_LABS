package LineDrawing;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class LiningPanel extends javax.swing.JPanel{
	private static final double LIMIT = 15.0;
	private int lines;

	public LiningPanel() {
		lines = 1;
	}

	public void moreLines(){
		++lines;
		lines = (int)(lines%LIMIT);
	}

	// public void run()
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int w = getWidth();
		int h = getHeight();

		Random random = new Random();

		for(int i = 0; i < lines; i++)
		{
			int w2 = (int)((i/LIMIT)*w); 
			int h2 = (int)((i/LIMIT)*h); 
			
		//d.	Add random colors to the lines 
			int red = random.nextInt(255);
			int green = random.nextInt(255);
			int blue = random.nextInt(255);
			g.setColor(new Color(red, green, blue));

		// c.	Modify the code to mirror the design in all four corners, as shown in the figure below	
		//	g.drawLine(x1, y1, x2, y2) <-- order of lines
			g.drawLine(0,  h2, w2, h);
			g.drawLine(w2,  h, w, h-h2);
			g.drawLine(w,  h-h2, w-w2, 0);
			g.drawLine(w-w2, 0, 0, h2);
		}
	}
}

