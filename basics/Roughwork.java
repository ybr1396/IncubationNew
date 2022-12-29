package basics;
import java.util.*;
public class Roughwork {
static void rotate(int arr[]) {
		int x = arr[arr.length - 1], i;
		for (i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
			arr[0] = x;		
	}
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		System.out.println("Given array is");
		System.out.println(Arrays.toString(arr));
		rotate(arr);
		System.out.println("Rotated array");
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}













































































//		
//		int sum=0;
//		double average;
//		for (int number:numbers) {
//			numbers[number] = sc.nextInt();
//			sum+=number;
//			}
//			int arrayLength = numbers.length;
//		
//		 average =  ((double)sum / (double)arrayLength);
//
//		   System.out.println("Sum = " + sum);
//		   System.out.println("Average = " + average);
//		

//			if (age[i] >= 50)
//				old++;
//			else if (age[i] <= 50 && age[i] >= 10)
//				young++;
//			else if (age[i] <= 10 && age[i] >= 0)
//				child++;
//			else
//				invalid++;}
//		for (int i = 0; i < age.length; i++) {
//			System.out.println(age[i] + " ");}
//System.out.println("old-" + old + "young-" + young + "child-" + child + "invalid-" + invalid);
//	}}

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the Number: ");
//		int n = sc.nextInt();
//		for (int i = 1; i <= n; i++) {
//			for (int j =1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			for (int j =i; j <= n; j++) {
//				System.out.print("  ");
//			}
//			
//			System.out.println();
//		}
//	}
//}

//		 System.out.println("   J    a   v     v  a  ");
//		 System.out.println("   J   a a   v   v  a a ");
//		 System.out.println("J  J  aaaaa   V V  aaaaa  ");
//		 System.out.println("J J  a     a   V  a     a");
