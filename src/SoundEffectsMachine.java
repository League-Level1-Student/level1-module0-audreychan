import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JFrame frame = new JFrame();
	JButton buttonOne = new JButton();
	JButton buttonTwo = new JButton();
	JButton buttonThree = new JButton();
	JButton buttonFour = new JButton();
	
public static void main(String[] args) {
	SoundEffectsMachine soundEffectsMachine = new SoundEffectsMachine();
	soundEffectsMachine.showButton();
}
	
public void showButton() {
	//JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel();
	frame.add(panel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	
	//JButton buttonOne = new JButton();
	buttonOne.setText("R2D2");
	panel.add(buttonOne);
	buttonOne.addActionListener(this);
	
	//JButton buttonTwo = new JButton();
	buttonTwo.setText("Car Skid");
	panel.add(buttonTwo);
	buttonTwo.addActionListener(this);
	
	//JButton buttonThree = new JButton();
	buttonThree.setText("Explosion");
	panel.add(buttonThree);
	buttonThree.addActionListener(this);
	
	//JButton buttonFour = new JButton();
	buttonFour.setText("Punch");
	panel.add(buttonFour);
	buttonFour.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == buttonOne) {
			playSound("r2d2Eureka.wav");
		}
		else if(e.getSource() == buttonTwo) {
			playSound("carSkid.wav");
		}
		else if(e.getSource() == buttonThree) {
			playSound("explosion.wav");
		}
		else if(e.getSource() == buttonFour) {
			playSound("punch.wav");
		}
		
	}
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
}
