package LineDrawing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ControlPanel extends javax.swing.JPanel implements ActionListener {

	private FlipBook animation;
	private JButton controlButton;

	public ControlPanel(FlipBook itemBeingControlled) {
		animation = itemBeingControlled;
		controlButton = new JButton("Stop");
		controlButton.addActionListener(this);
		this.add(controlButton);
	}

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