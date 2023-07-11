package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import _01_Olympic_Rings.OlympicRings_Threaded;

public class AdvancedRobotRace implements Runnable {
	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Thread r1 = new Thread(new AdvancedRobotRace());
    	r1.start();
 //   	bol1 = true;
    	Thread r2 = new Thread(new AdvancedRobotRace());
    	r2.start();
 //    	bol2 = true;
    	Thread r3 = new Thread(new AdvancedRobotRace());
    	r3.start();
 // 	bol3 = true;
    	Thread r4 = new Thread(new AdvancedRobotRace());
    	r4.start();
 // 	bol4 = true;
    	Thread r5 = new Thread(new AdvancedRobotRace());
    	r5.start();
 // 	bol5 = true;
		Robot[] robots = new Robot[5];

		for (int i = 0; i < robots.length; i++) {

			robots[i] = new Robot();
			robots[i].setY(540);
			robots[i].setX(100 + (i * 100));
			robots[i].setSpeed(150);

		}
//ifdgdg
		boolean raceInProgress = true;
		boolean firstRobot = false;
		int WinningRobot = -1;
		while (raceInProgress) {
			for (int i = 0; i < robots.length; i++) {
				if (robots[i].getY() < 0) {
					raceInProgress = false;
					WinningRobot = i;
					JOptionPane.showMessageDialog(null, "The winning robot is robot number " + WinningRobot + "!");
					robots[WinningRobot].setSpeed(100);
					robots[WinningRobot].turn(180);
					robots[WinningRobot].move(25);
					robots[WinningRobot].turn(180);
					break;

				}

				Random rand = new Random();
				int p = rand.nextInt(50);
				robots[i].move(p);
				robots[i].setSpeed(150);

			}
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
