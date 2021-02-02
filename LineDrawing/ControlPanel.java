package LineDrawing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ControlPanel extends javax.swing.JPanel implements ActionListener {

	private FlipBook animation;
	private JButton controlButton;

	/**
	 * Constructor
	 * @param itemBeingControlled
	 * 		Runnable object that animates a JPanel
	 */
	public ControlPanel(FlipBook itemBeingControlled) {
		animation = itemBeingControlled;
		controlButton = new JButton("Draw");
		animation.setStopped(true);
		
		controlButton.addActionListener(this);
		this.add(controlButton);
	}

	/**
	 * Control Button:
	 * onClick the animation will resume if stopped or stop if running
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(animation.isStopped()){
			animation.setStopped(false);
			controlButton.setText("Stop");
		}else{
			animation.setStopped(true);
			controlButton.setText("Resume");
		}

	}


}