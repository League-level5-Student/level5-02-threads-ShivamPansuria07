package _01_Olympic_Rings;

import java.util.Iterator;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded implements Runnable{
	static boolean bol1 = false;
	static boolean bol2 = false;
	static boolean bol3 = false;
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
	
		
		
	   
	    	Thread r1 = new Thread(new OlympicRings_Threaded());
	    	r1.start();
	    	bol1 = true;
	    	Thread r2 = new Thread(new OlympicRings_Threaded());
	    	r2.start();
	    	bol2 = true;
	    	Thread r3 = new Thread(new OlympicRings_Threaded());
	    	r3.start();
	    	bol3 = true;
	    	
		}
		
		
		
		
		


	@Override
	public void run() {
		Robot timmy = new Robot();
	if(bol1) {
		 timmy.moveTo(400, 700);
		 bol1 = false;
	}else if(bol2) {
		timmy.moveTo(450, 700);
		 bol2 = false;
	}else if(bol3){
		timmy.moveTo(425, 650);
		bol3 = false;
	}
		
		timmy.setSpeed(10);
		for (int i = 0; i < 25; i++) {
			timmy.penDown();
			timmy.turn(i);
			timmy.move(i);
		}
		
	}
}

