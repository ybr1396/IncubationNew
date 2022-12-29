//Write a program in java to display the n terms of odd natural number and their sum.
package assignments;
 import java.util.*;
 
public class Sumofoddnumbers {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum=0;	
		System.out.println("Enter number of terms: ");
		{
			 in = new Scanner (System.in);
			 n=in.nextInt();
			 System.out.println("\nThe odd numbers are:");
			 for(i=1;i<=n;i++)
			 {
				 System.out.println(2*i-1);
				 sum+=2*i-1;
			 }
		 
			 System.out.println("The sum of odd natural numbers upto" +n+ "terms is: "  +sum);
		}
	}
}
