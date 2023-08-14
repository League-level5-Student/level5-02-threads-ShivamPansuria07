package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable{

	private int threadNumber;

    public ThreadedGreeter(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println("Hello from thread number: " + threadNumber);
        if (threadNumber < 50) {
            Thread t = new Thread(new ThreadedGreeter(threadNumber + 1));
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

