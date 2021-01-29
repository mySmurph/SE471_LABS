package LineDrawing;

import java.awt.Color;
import java.awt.Graphics;

public class LiningPanel extends javax.swing.JPanel {

    public LiningPanel() { }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int x1 = getWidth();
        int y1 = getHeight();
        
        double lines = 15.0;

        for(int i = 0; i < lines; i++)
        {
            int x2 = (int)((i/lines)*x1); 
            int y2 = (int)((i/lines)*y1); 
            
            g.drawLine(0,  y2, x2, y1);
        }
        
    }
    
}
