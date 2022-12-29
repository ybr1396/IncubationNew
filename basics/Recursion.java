package basics;

import java.util.Scanner;

public class Recursion{

static int f(int n)
{
  if (n == 0 || n == 1)
	  
    return 1;
  
  else
  {
	  System.out.println(n);
	  
	  
	  int result =n * f(n - 1);
	  
	  System.out.println("-------------------------");
	  
	  System.out.println(result);
	  
      return result;
  }
}

public static void main(String[] args)
{
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter the no of Elements: ");
  int n = sc.nextInt();
  System.out.println("factorial of " +n +" is "+ f(n));
}
}




























//public interface Drawable {
//	
//	public void draw(); 
//		
//public class LE{
//	public static void main(String [] args) {
//		int width =10;
//		
//		Drawable d =()->{
//			System.out.println("Drawing"+ width);
//		};
//		d.draw();
//	}
//
//}
//
//	
//}