/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
        String spidermanURL = "https://m.media-amazon.com/images/M/MV5BNTk4ODQ1MzgzNl5BMl5BanBnXkFtZTgwMTMyMzM4MTI@._V1_UX182_CR0,0,182,268_AL_.jpg";
        // 2. create a variable of type "Component" that will hold your image
        Component spiderman = createImage(spidermanURL);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
        quizWindow.add(spiderman);
		// 5. call the pack() method on the quiz window
        quizWindow.pack();
		// 6. ask a question that relates to the image
        String questionOne = JOptionPane.showInputDialog("Who played Spiderman in Spiderman Homecoming?");
		// 7. print "CORRECT" if the user gave the right answer
        if(questionOne == "Tom Holland") {
        	System.out.println("CORRECT");
        }
		// 8. print "INCORRECT" if the answer is wrong
        else {
        	System.out.println("INCORRECT");
        }
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
        quizWindow.remove(spiderman);
		// 10. find another image and create it (might take more than one line of code)
        String infinityWarURL = "https://vignette.wikia.nocookie.net/marvelcinematicuniverse/images/6/68/Avengers_Infinity_War_textless_poster_art.jpg/revision/latest/scale-to-width-down/365?cb=20180417151906";
        Component infinityWar = createImage(infinityWarURL);
		// 11. add the second image to the quiz window
        quizWindow.add(infinityWar);
		// 12. pack the quiz window
        quizWindow.pack();
		// 13. ask another question
        String questionTwo = JOptionPane.showInputDialog("Who was the first person to die in Avengers: Infinity War?");
		// 14+ check answer, say if correct or incorrect, etc.
        if(questionTwo == "Heimdall") {
        	System.out.println("CORRECT");
        }
        else {
        	System.out.println("INCORRECT");
        }
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}




