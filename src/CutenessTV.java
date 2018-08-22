import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame = new JFrame();
	JButton buttonOne = new JButton();
	JButton buttonTwo = new JButton();
	JButton buttonThree = new JButton();
	
	public static void main(String[] args) {
		CutenessTV tv = new CutenessTV();
		tv.showButton();
	}
	
	public void showButton() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(buttonOne);
		panel.add(buttonTwo);
		panel.add(buttonThree);
		
		buttonOne.setText("Ducks");
		buttonTwo.setText("Puppies");
		buttonThree.setText("Kittens");
		
		buttonOne.addActionListener(this);
		buttonTwo.addActionListener(this);
		buttonThree.addActionListener(this);
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == buttonOne) {
			showDucks();
		}
		else if(e.getSource() == buttonTwo) {
			showPuppies();
		}
		else if(e.getSource() == buttonThree) {
			showKittens();
		}
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=qR4Q2FKsrvA");
	}

	void showPuppies() {
	     playVideo("https://www.youtube.com/watch?v=f8VYNWzJAmE");
	}

	void showKittens() {
	     playVideo("https://www.youtube.com/watch?v=sYa-QqB5hHQ");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
