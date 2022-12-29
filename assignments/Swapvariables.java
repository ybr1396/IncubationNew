// 2) Write a java program to swap variables.
package assignments;
import java.util.*;
public class Swapvariables {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Input the first number:");
		num1=in.nextInt();
		System.out.println("Input the second number:");
		num2=in.nextInt();	
		temp=num1;
		num1=num2;
		num2=temp;	
		System.out.println("Swapped values are:" +num1+ "and" +num2);	
		in.close();}
	}
