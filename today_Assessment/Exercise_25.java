//25.Reverse a 3-digit number.
package today_Assessment;

import java.util.Scanner;

public class Exercise_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,reversed=0;
		System.out.println("Enter the Three digit number:");
		Scanner sc = new Scanner(System.in);
          num= sc.nextInt();
          
          while(num != 0) {
        	    
              int digit = num % 10;
              reversed = reversed * 10 + digit;
              num /= 10;
            }

          System.out.println("Enter the Reversed Number:\n" +reversed);
	}

}
