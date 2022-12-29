package today_Assessment;

import java.util.Scanner;

public class Exercise_22_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int x, y;   
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of X and Y");  
	       x = sc.nextInt();  
	       y = sc.nextInt();  
	       System.out.println("Before swapping numbers: "+x +"  "+ y);  
	       
	       x=x+y;
	       y=x-y;
	       x=x-y;
	       
	       System.out.println("After swapping numbers: "+x +"  "+ y);

	}

}
