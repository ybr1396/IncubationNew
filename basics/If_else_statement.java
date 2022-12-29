package basics;

import java.util.Scanner;

public class If_else_statement {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter the Year: ");
		Scanner in= new Scanner(System.in);
		year=in.nextInt();
		
		if(year%4==0 ||(year%100==0&&year%400==0)) {
			System.out.println("Year"+ year +"is a Leap year");
			}
		else {
			System.out.println("Year"+ year+ "is not Leap year");
		}
		
		in.close();
		
	    

	}

}
