package demo;

public class ThreadCaller {

	public static void main(String[] args) throws InterruptedException {

		ChildThread ct = new ChildThread();
		System.out.println(ct.getState());
		// ct.setPriority(1);
		System.out.println(ct.getName());
		ct.start();
		System.out.println(ct.getState());
		// ct.start();
		/*
		 * Child c = new Child(); c.start();
		 */
		ct.setName("Customer");
		System.out.println(ct.getName());
		System.out.println(ct.getId());
		System.out.println(ct.getPriority());
        
		 ct.interrupt();
		//ct.join();
		for (int i = 1; i < 5; i++) {
			System.out.println("Main Thread" + i);
		}
		System.out.println(ct.getState());
	}

}
