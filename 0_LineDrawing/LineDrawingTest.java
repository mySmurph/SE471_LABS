/**
 * SE471 - Lab0
 * Purpose: 
 * 	1)	learn/recall basic Java programming and understand how the GUI event dispatch thread works.
 * 	2)	Use a Runnable  thread 
 * 
 * Lauren Gonzalez	gonza823
 * Sirena Murphree	murph135
 */
package LineDrawing;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class LineDrawingTest {

    public static void main(String[] args) {

        JFrame application = new JFrame();
        LiningPanel panel = new LiningPanel();
		FlipBook animation = new FlipBook(panel);

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		application.getContentPane().add(new ControlPanel(animation), BorderLayout.NORTH);
        application.getContentPane().add(panel,  BorderLayout.CENTER);
        application.setSize(300, 350);
        application.setTitle("Lining Art");
		application.setVisible(true);
		
		animation.run();
    }
}
