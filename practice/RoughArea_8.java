package practice;

import java.util.*;

public class RoughArea_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String value: ");
		String st = sc.nextLine();
		char[] A = st.toCharArray();
		
		int flag = 0;
		for(int i=0,j=st.length()-1;i<j;i++,j--) {
			if(A[i]!=A[j]) {
				flag++;
				break;
			}	
		}
		if(flag==0) {
			System.out.println("Given term will be Palindrome");}
		else {
			System.out.println("Given term will be not Palindrome");
		}
	}}