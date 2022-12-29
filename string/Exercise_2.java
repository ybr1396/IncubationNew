package string;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string value: ");
		String s = sc.nextLine();
		System.out.println("After Reverse String:");
		String s1="";
		
		for (int i =s.length(); i >0; i--) {
			char c =s.charAt(i-1);
			s1=s.substring(9, 15).concat(" "+s.substring(0, 8));
					
				}
        System.out.println("Output:\n"+s1); 
	}
}
















//System.out.println(s1);
//System.out.println(s2);
//System.out.println(s4);
//System.out.println(s5);
//System.out.println(s6);

/*for(int i=0;i<s.length();i++) {
char c1=s.charAt(i);
s4=s.substring(0, 6);
s5=s.substring(7, 15);
s6 =s5.concat(s4);
System.out.print(c1);
}*/
