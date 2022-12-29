package practice;

import java.util.Scanner;

public class RoughArea_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string value: ");
		String s = sc.nextLine();
		int count=0,count1=0,count2=0,count3=0,count4=0;
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
			char u = Character.toUpperCase(c);
			if(u=='A'||u=='E'||u=='I'||u=='O'||u=='U')
				count3++;
			//char l = Character.toLowerCase(c);
			//if(u=='a'||u=='e'||u=='i'||u=='o'||u=='u')
				//count4++;
			//System.out.println(u+"="+(int)u);
			//System.out.println(l+"="+(int)l);
				
			if(Character.isDigit(c))
				count2++;
			
			//if(Character.isUpperCase(c))
				//count++;
			
			//if(Character.isLowerCase(c))
				//count1++;
	    System.out.println(c +"= "+(int)c);
		}
		
		//System.out.println(count +"-"+ "UPPER");
		//System.out.println(count1 +"-"+"LOWER");
		System.out.println(count2 +"-"+"DIGIT");
		System.out.println(count3 +"-"+"VOWELS");
		//System.out.println(count4 +"-"+"VOWELS");
	}

}



/*String ch ="Hello";
String ch1 = ch;
String ch2 ="Hello";
String ch3 = new String("Hello");
String ch4 = new String(ch);

System.out.println(ch.hashCode());
System.out.println(ch1.hashCode());
System.out.println(ch2.hashCode());
System.out.println(ch3.hashCode());
System.out.println(ch4.hashCode());
System.out.println(ch.equals(ch2));*/