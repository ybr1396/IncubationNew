//1.Write a java program to print 'Hello' on Screen and 
//then print your name on a Separate line.

package today_Assessment;
import java.util.Scanner;
public class Exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Hello,What is your name?");
		String input = sc.nextLine();
		System.out.println("Welcome" + input);
		sc.close();
	}
}
