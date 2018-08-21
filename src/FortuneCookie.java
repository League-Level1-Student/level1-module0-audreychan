
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public static void main(String[] args) {
	FortuneCookie fc = new FortuneCookie();
	fc.showButton();
}
public void showButton() {
	System.out.println("Button clicked");
	
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JButton button = new JButton();
	frame.add(button);
	button.addActionListener(this);

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//JOptionPane.showMessageDialog(null, "Woohoo");
	int rand = new Random().nextInt(5);
	//fortunes were found online, I did not make them up.
	if(rand == 0) {
		JOptionPane.showMessageDialog(null, "Your fortune is: The fortune you seek is in another cookie.");
	}
	else if(rand == 1) {
		JOptionPane.showMessageDialog(null, "Your fortune is: A foolish man listens to his heart. A wise man listens to cookies.");
	}
	else if(rand == 2) {
		JOptionPane.showMessageDialog(null, "Your fortune is: You will live long enough to open many fortune cookies.");
	}
	else if(rand == 3) {
		JOptionPane.showMessageDialog(null, "Your fortune is: He who laughs at himself never runs out of things to laugh at.");
	}
	else if(rand == 4) {
		JOptionPane.showMessageDialog(null, "Your fortune is: You will be hungry again in one hour.");
	}
}
}
