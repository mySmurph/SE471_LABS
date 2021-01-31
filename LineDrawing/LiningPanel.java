package LineDrawing;

import java.awt.Color;
import java.awt.Graphics;

public class LiningPanel extends javax.swing.JPanel {

	public LiningPanel() { }

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int w = getWidth();
		int h = getHeight();
		
		double lines = 15.0;

		for(int i = 0; i < lines; i++)
		{
			int w2 = (int)((i/lines)*w); 
			int h2 = (int)((i/lines)*h); 
			
		//	g.drawLine(x,  y, x1, y2);
			g.drawLine(0,  h2, w2, h);
			g.drawLine(w2,  h, w, h-h2);
			g.drawLine(w,  h-h2, w-w2, 0);
			g.drawLine(w-w2, 0, 0, h2);
		}
		
	}
	
}
