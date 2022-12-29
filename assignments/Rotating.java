//3) Given two strings a and b.The task is to find if the string 'b' can be obtained by rotating another string 'a' by exactly 2 places
// input: a=amazon b=azonam output=1
//input : a=geeksforgeeks b=geeksgeeksfor output:0
package assignments;
import java.util.*;
public class Rotating {
	public static void main(String[] args) {
		String a="",b="",result="",part1="",part2="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 2 strings");
		a=scan.nextLine();
		b=scan.nextLine();
		char[] a1=a.toCharArray();
		int alen=a1.length;
		
		for(int i=0;i<alen;i++) {
			if(i!=0 && i!=1)
				part1+=a1[i];
			else if(i==0||i==1)
				part2+=a1[i];
		}

		result=part1+part2;
		System.out.println(result);
		
		if(b.equals(result))
			System.out.println("1");
		else
			System.out.println("0");
		
		scan.close();
	}

}
