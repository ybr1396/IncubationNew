package demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {



		ExceptionHandlingDemo ehd1 = new ExceptionHandlingDemo();
		ExceptionHandlingDemo ehd2;	
		try {
			
			ehd1.test();
			ehd1.test1();
			
			

		}
		catch(NullPointerException npe)
		{
			System.out.println("Caught Second Time");		
		}
	}


	private void test1() throws ArithmeticException {
		try {
			EHDemo1.divide(5, 1);
			throw new ArithmeticException(); 
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Please check your inputs");
			throw ae;

		}	

	}


	private void test() {

		try {
		
			throw new NullPointerException();	
		}
		
		catch(NullPointerException npe)
		{
			
			System.out.println("Got NPE");
			throw npe;
		}	
	}
}
