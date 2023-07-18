package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import _01_Olympic_Rings.OlympicRings_Threaded;

public class AdvancedRobotRace implements Runnable {
	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.
	Robot robots = new Robot();
	static boolean bol1 = false;
	static boolean bol2 = false;
	static boolean bol3 = false;
	static Thread r1;
	static Thread r2;
	static Thread r3;
	static Thread r4;
	static Thread r5;
	static String robotWinner;
	static boolean raceInProgress = true;
	public static void main(String[] args) {
		
		 r1 = new Thread(new AdvancedRobotRace());
    	
 //   	bol1 = true;
    	 r2 = new Thread(new AdvancedRobotRace());
    	
 //    	bol2 = true;
    	 r3 = new Thread(new AdvancedRobotRace());
    
 // 	bol3 = true;
    	 r4 = new Thread(new AdvancedRobotRace());
    	
 // 	bol4 = true;
    	 r5 = new Thread(new AdvancedRobotRace());
    	
 // 	bol5 = true;
//l		
    	r1.start();
    	r2.start();
    	r3.start();
    	r4.start();
    	r5.start();
    	
	}

	@Override
	public void run() {
		Random rand = new Random();
		int dist = rand.nextInt(150)+50;
	
		
			robots.setY(540);
			robots.setX((dist)+50);
			robots.setSpeed(150);

		

		
		boolean firstRobot = false;
		int WinningRobot = -1;
		while (raceInProgress) {
				if (robots.getY() <= 0) {
					

					
		if(!r1.isAlive()) {
			JOptionPane.showMessageDialog(null, "robot 1 wins!");
		}else if(!r2.isAlive()){
			JOptionPane.showMessageDialog(null, "robot 2 wins!");
		}else if(!r3.isAlive()){
			JOptionPane.showMessageDialog(null, "robot 3 wins!");
		}else if(!r4.isAlive()){
			JOptionPane.showMessageDialog(null, "robot 4 wins!");
		}else if(!r5.isAlive()){
			JOptionPane.showMessageDialog(null, "robot 5 wins!");
		}
				
		raceInProgress = false;
					break;

				}

			
				int p = rand.nextInt(50);
				robots.move(p);
				robots.setSpeed(150);

			
		}
		
	}
}
