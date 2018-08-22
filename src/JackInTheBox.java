import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JackInTheBox implements ActionListener {
public static void main(String[] args) {
	JackInTheBox box = new JackInTheBox();
	box.showButton();
	
}
public void showButton() {
	System.out.println("Button clicked");
		
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(100, 100);
	JButton button = new JButton();
	button.setText("Surprise!");
	frame.add(button);
	button.addActionListener(this);
	
	
}

int pressed = 0;	
int rand = new Random().nextInt(7) + 3;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		pressed ++;
		System.out.println(pressed);
		
		if (pressed == rand) {
			showPicture("jackInTheBox.png");
			playSound("homer-woohoo.wav");
		}
	}

	private void showPicture(String fileName) {
		try {
			JLabel imageLabel = createLabelImage(fileName);
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		}
	private JLabel createLabelImage(String fileName) {
		try {
			URL imageURL = getClass().getResource(fileName);
			if(imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			}
			else {
				Icon icon = new ImageIcon(imageURL);
				JLabel imageLable = new JLabel(icon);
				return imageLable;
			}
		}
		catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
	}
	private void playSound(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}












