package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot e = new Robot();
		// 5. Set your robot's pen down 
		e.penDown();
		// 3. Set the robot to go at max speed (100)
		e.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i=0; i<75; i++) {
			
		
			// 7. Change the pen color to random
		e.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
			e.move(200);
			// 2. Turn the robot 360/7 degrees to the right
		int il; e.turn(360/7);
			// 8. Set the pen width to i
		e.setPenWidth(i);
		}	
	}
}
