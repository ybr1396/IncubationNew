package today;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int n = sc.nextInt();
      
      if(isPrime(n)) {
    	  System.out.print(n+"-"+"It is a Prime Number");
      }
      else {
    	  System.out.print(n+"-"+"It is not a Prime Number");
      }

	}
	 public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i=i+2) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
	}  


