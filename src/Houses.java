import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot r2d2 = new Robot();
	
	Random gen = new Random();
	
	void go() {
		r2d2.moveTo(100, 500);
		r2d2.setSpeed(5000);
		r2d2.penDown();
		r2d2.hide();
		for(int i = 0; i < 11; i ++) {
			int randomHeight = gen.nextInt(110) + 20;
			
			int num = gen.nextInt(2);
			if(num == 0) {
				flatRoof(randomHeight);
			}
			else {
				peakedRoof(randomHeight);
			}
		}
		
	}
	void flatRoof(int height) {
		r2d2.setRandomPenColor();
		r2d2.move(height);
		
		r2d2.turn(90);
		r2d2.move(40);
		r2d2.turn(90);
		
		r2d2.move(height);
		r2d2.turn(-90);
		
		r2d2.setPenColor(Color.GREEN);
		r2d2.move(20);
		r2d2.turn(-90);
	}
	void peakedRoof(int height) {
		r2d2.setRandomPenColor();
		r2d2.move(height);
		
		r2d2.turn(45);
		r2d2.move(30);
		r2d2.turn(90);
		r2d2.move(30);
		r2d2.turn(45);
		
		r2d2.move(height);
		r2d2.turn(-90);
		
		r2d2.setPenColor(Color.GREEN);
		r2d2.move(20);
		r2d2.turn(-90);
	}
	
public static void main(String[] args) {
	new Houses().go();
}
}
