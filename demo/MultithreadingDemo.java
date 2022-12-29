package demo;

/*class Worker extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}*/



class RunnableWorker implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <= 4; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
	
}

public class MultithreadingDemo {

	public static void main(String[] args) {

		
		
		Runnable r = new RunnableWorker(); 
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		/*
		 * Thread t1 = new Worker(); Thread t2 = new Worker(); Thread t3 = new Worker();
		 */

		t1.start();
		t2.start();
		t3.start();
	}
}
