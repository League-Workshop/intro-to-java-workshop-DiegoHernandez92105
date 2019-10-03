package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot nlk = new Robot();
	nlk.setSpeed(200);
		nlk.move(200);
		nlk.penDown();
		for (int i=0; i<4; i++) {
			nlk.setPenColor(255, 0, 0);
		nlk.turn(90);
		nlk.move(201);
		nlk.setPenColor(244, 255, 0);
		nlk.turn(90);
		nlk.move(201);
		nlk.setPenColor(255, 144, 10);
		nlk.turn(90);
		nlk.move(201);
		nlk.setPenColor(0,255,70);
		nlk.turn(90);
		nlk.move(201);
		}
		nlk.turn(-90);
		nlk.setSpeed(200);
		nlk.move(200);
		nlk.penDown();
		for (int i=0; i<4; i++) {
			nlk.setPenColor(255, 0, 0);
		nlk.turn(90);
		nlk.move(201);
		nlk.setPenColor(244, 255, 0);
		nlk.turn(90);
		nlk.move(201);
		nlk.setPenColor(255, 144, 10);
		nlk.turn(90);
		nlk.move(201);
		nlk.setPenColor(0,255,70);
		nlk.turn(90);
		nlk.move(201);
		nlk.moveTo(1, 7);
		
		}
	}
}
