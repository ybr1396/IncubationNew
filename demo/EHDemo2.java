package demo;

public class EHDemo2 {

	public static void main(String[] args) {
		try {
			EHDemo1.divide(5, 0);
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Please check your inputs");
		}	
	}
}
