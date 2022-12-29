package practiceproblems;
public class Exercise9 {
public int factorial(int i)
			{if (i == 0)
			return 1;
			return i * factorial(i - 1);
			}
public static void main(String[] args)
			{int n = 4, i, j;
			Exercise9 in = new Exercise9();
			for (i = 0; i <= n; i++) {
			for (j = 0; j <= n - i; j++) {
						System.out.print(" ");}
					for (j = 0; j <= i; j++) {
System.out.print(" " + in.factorial(i)/ (in.factorial(i - j)* in.factorial(j)));}
					System.out.println();
	}
  }
}
