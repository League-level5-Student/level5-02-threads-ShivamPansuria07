package _03_Threaded_Greeting;

import _01_Olympic_Rings.OlympicRings_Threaded;

public class ThreadedGreeter implements Runnable {
	int num;
	//3. In the run method of the ThreadedGreeter class, print the message using the member variable as the thread number.
		//   If the member integer is less than or equal to 50, create a new thread. 
		//   Pass in a new object of the ThreadedGreeter class with the value of the member variable plus one.
		
		//4. Start the thread and join it with the calling thread.
		
	ThreadedGreeter(){
		num = 1;
	}
	@Override
	public void run() {
		System.out.println(num);
		if(num<=50) {
			Thread r1 = new Thread(new ThreadedGreeter());
			num = (new ThreadedGreeter().num)+1;
	    	r1.start();
		}
	}

}
