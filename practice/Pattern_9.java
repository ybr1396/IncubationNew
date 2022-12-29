package practice;

import java.util.Scanner;

public class Pattern_9 {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the no of elements: ");
         int n = sc.nextInt();
         int row,col;
         for(row=1;row<=n;row++) {
        	 for(col=1;col<row;col++) {
        		 System.out.print("  ");
        	 }
        	 
        	 for(col=row;col<=n;col++) {
        		 if(row==1||col==row)
        		 System.out.print("* ");
        		 else
        			 System.out.print("  ");
        	 }
        	 for(col=row;col<n;col++) {
        		 if(row==1||col+row==n+1)
        		 System.out.print("* ");
        		 else
        			 System.out.print("  ");
        	 }
        	 
        	 
        	 
        	/* for(col=n+1;col<=(2*n-row);col++) {
        		 if(row==1||col==(2*n-row))
        				 //row+col==n+1)
        		 System.out.print("* ");
        		 else
        			 System.out.print("  ");
        	 }*/
        	 
        	 System.out.println();
         }
	}

}
