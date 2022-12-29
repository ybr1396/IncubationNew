package basics;
public class Array_Reverse {
public static void main(String[] args) 
       {
		int[] array = new int[] { 2, 3, 4, 5, 6 };
		System.out.println("Input array:");
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
         }
		
		System.out.println();
		System.out.println("Array in Reverse order:");
		int i,temp;
	    temp = array[array.length - 1];

		for (i = array.length - 2; i >= 0; i--)
		{

			array[i + 1] = array[i];
		}
		array[0] = temp;
		
		for (int j = 0; j < array.length; j++)
		{
			System.out.print(array[j] + " ");

		}
		
		// for (int i =array.length-1;i>=0;i--) {
		// System.out.print(array[i] + " ");

		// }

	     }

         }
