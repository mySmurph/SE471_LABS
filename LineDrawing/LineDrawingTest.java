package LineDrawing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class LineDrawingTest extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	private JButton playButton;
	private boolean isPlaying;
	private Thread rainbow;

	public LineDrawingTest() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel buttonPanel = new JPanel();
		playButton = new JButton("Start");
		playButton.addActionListener(this);
		buttonPanel.add(playButton);
		getContentPane().add(buttonPanel, BorderLayout.NORTH);

		Runnable panel = new LiningPanel();
		rainbow = new Thread(panel);

		getContentPane().add(((LiningPanel) panel).getPanel(), BorderLayout.CENTER);
		this.setSize(300, 350);
		this.setTitle("Lining Art");
		this.setVisible(true);
	}
		/**
	 * Shuffles  and repaints the panels with new cards
	 * @param    e    event handler
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(isPlaying){
			//stop
			playButton.setText("Start");
		}else{
			//go
			playButton.setText("Stop");
		}
		isPlaying = !isPlaying; 
	}


	public static void main(String[] args) {
		new LineDrawingTest();

	}

}
