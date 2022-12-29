package roughArea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

public  void passwordvalidation() throws FileNotFoundException {
	
	//public static void main(String[] args) throws FileNotFoundException {


		File file = new File("C:\\Users\\Administrator\\Documents\\Password.txt");
		Scanner sc = new Scanner(file);
		boolean present = sc.hasNext();
		System.out.println(present);
		while(present)
		{
			String word = sc.nextLine();
			int i = word.lastIndexOf(":");
			String password = word.substring(i+1);


			Pattern p = Pattern.compile("/(?=.[A-Z].?[A-Z])(?=.?[a-z].?[a-z])(?=.?[0-9].?[0-9]).{6,20}$/");
			Matcher m = p.matcher(password);
			if(m.find())
				System.out.println(m.group()+"  is valid password.");
			else
				System.out.println(password +"  is Invalid password.");
			present = sc.hasNext();

		}

	}
}
