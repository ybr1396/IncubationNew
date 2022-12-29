package basics;
import java.util.Scanner;
public class VowelsInaString {

	void Vowels(String str) {
		int vCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				System.out.print(ch + " ");
				vCount++;
			}
		}
		System.out.println("\nCount of the Vowels:\n" + vCount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.nextLine();
		VowelsInaString chr = new VowelsInaString();
		System.out.println("Vowels in a String:");
		chr.Vowels(s);
        
		char check = 'i';
		char check1 = 'a';
		int count = 0, count1 = 0;
		
		for (int i = 0; i < s.length(); i++)
		{
			if (check == s.charAt(i))
				count++;
		}
		for (int j = 0; j < s.length(); j++) 
		{
			if (check1 == s.charAt(j))
				count1++;
		}

System.out.println("count of Repeated letter:\n" + "i= " + count + "\na= " + count1);

	    }

        }
