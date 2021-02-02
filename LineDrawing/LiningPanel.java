package LineDrawing;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class LiningPanel extends javax.swing.JPanel{
	private static final double LIMIT = 75.0;
	private int lines;
	private Color rgbColor[];

	public LiningPanel() {
		lines = 0;
		rgbColor = new Color[(int)LIMIT];
		newRandomColor();
	}

	public void moreLines(){
		++lines;
		lines = (int)(lines%LIMIT);
		newRandomColor();
	}
	private void newRandomColor(){
		Random random = new Random();
		int red = random.nextInt(255);
		int green = random.nextInt(255);
		int blue = random.nextInt(255);
		rgbColor[lines] = new Color(red, green, blue);
	}

	// public void run()
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

