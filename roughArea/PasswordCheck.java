package roughArea;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter your Password");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String regex = "/(?=.[A-Z].?[A-Z])(?=.?[a-z].?[a-z])(?=.?[0-9].?[0-9]).{6,}$/";

		//		Pattern p = Pattern.compile("/(?=.[A-Z].?[A-Z])(?=.?[a-z].?[a-z])(?=.?[0-9].?[0-9]).{6,20}$/");
		//		Matcher m = p.matcher(password);
		//		if(m.find())
		//			System.out.println(m.group()+"  is valid password.");
		//		else
		//			System.out.println(password +"  is Invalid password.");

		if (word.matches(regex)) {
			System.out.println("Valid");
		}else {
			System.out.println("In-Valid");
		}
	}

}


