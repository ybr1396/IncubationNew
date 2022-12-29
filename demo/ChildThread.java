package demo;

public class ChildThread extends Thread {
	
	public void run()
	{
		for(int i = 1; i<5;i++)
		{
			//Thread.yield();
			try {
				Thread.sleep(2000);
				System.out.println("Child Thread"+i);
			} catch (InterruptedException e) {
				
				System.out.println("My sleep got Interrupted");
				//e.printStackTrace();
			}
			
		}
	}

}
