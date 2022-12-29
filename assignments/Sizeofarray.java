//Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the 
//end of array without changing the order of positive element and negative element.
// Input: N=8 arr[] ={1,-1,3,2,-7,-5,11,6} output: 1 3 2 11 6 -1 -7 -5
// Input: N= 8 


package assignments;
import java.util.*;
public class Sizeofarray {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = in.nextInt();
		int A[] = new int[n];
		for(int i=0;i<n;i++) { 
			A[i]=in.nextInt();}
		for(int k=0;k<n;k++) {
			if(!(A[k]==0 || A[k]==1 || A[k]==2)) {
				System.out.println("Invaild Number");
			}else {for(int i=0;i<n-1;i++) {
					for(int j=i+1;j<n;j++) {
						if(A[i]>A[j]) {						
							int temp=A[i];
							A[i]=A[j];
							A[j]=temp;}
			}}}}
		System.out.println(Arrays.toString(A));
		}}
