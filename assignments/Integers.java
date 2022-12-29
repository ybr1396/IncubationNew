package assignments;

import java.util.*;

public class Integers {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int arrLen=sc.nextInt(),a=0,b=0,c=0;
		int[]arr=new int[arrLen];
		int[] part1=new int[arrLen];
		int[] part2= new int[arrLen];
		System.out.println("Enter Elements:");
		for(int i=0;i<arrLen;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arrLen;i++) {
			if(arr[i]>=0) {
				part1[a]=arr[i];
				a++;
			}
			else {
				part2[b]=arr[i];
				b++;			
		}
		}
		
		for(int i=0;i<a;i++) {
			arr[c]=part1[i];
			c++;
		}
		for(int i=0;i<b;i++) {
			arr[c]=part2[i];
			c++;
		}
		System.out.println("Output");
		for(int i=0;i<arrLen;i++) {
			System.out.println(arr[i]);
		}
		}

}
