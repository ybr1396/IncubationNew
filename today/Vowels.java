package today;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter the input:");
		char s = ((ch.nextLine()).charAt(0));
		//char u = Character.toUpperCase(s);
		
	switch(s) {
	case'1':
		System.out.print("Monday");
		break;
	case'2':
		System.out.print("Tuesday");
		break;
	case'3':
		System.out.print("Wednesday");
		break;
	case'4':
		System.out.print("Thursday");
		break;
	case'5':
		System.out.print("Friday");
		break;
	case'6':
		System.out.print("Saturday");
		break;
	case'7':
		System.out.print("Sunday");
		break;	
	default:
		System.out.print("Case Not available within the range 1to7");
		
	}
	}
	}	
		
		
