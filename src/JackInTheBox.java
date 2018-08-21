import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

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
	JButton button = new JButton();
	button.setText("Surprise!");
	frame.add(button);
	button.addActionListener(this);
}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
