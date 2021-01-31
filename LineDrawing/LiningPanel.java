package LineDrawing;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class LiningPanel extends javax.swing.JPanel {

	public LiningPanel() { }

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int w = getWidth();
		int h = getHeight();
		
		double lines = 15.0;

		Random random = new Random();

		for(int i = 0; i < lines; i++)
		{
			int w2 = (int)((i/lines)*w); 
			int h2 = (int)((i/lines)*h); 
			
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
