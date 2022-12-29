package practice;

import java.util.*;

public class RoughArea_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string value: ");
		String s = sc.nextLine();
		String sn="",d="";
		for(int i=0;i<s.length();i++) {
			char c =s.charAt(i);
			if(Character.isUpperCase(c))
				sn=sn+c;
			else
				d=d+c;
		}
		System.out.println(sn);
		System.out.println(d);
		String sen = sn+d;
        System.out.println(sen);
	}

}
