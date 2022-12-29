package practice;

import java.util.Scanner;

public class RoughArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of elements: ");
		int n = sc.nextInt();
		int row,col;
		 for(row=1;row<n;row++) {
	           for(col=row;col<=n;col++) {
	        	   System.out.print("  ");
	           } 
	          for(col=1;col<row;col++) {
	        	  if(col==1) {
	        		  System.out.print("*"); 
	       	  }else { 
	       		  System.out.print("  "); 
	        	  }
	          }
	        	 
	        	for(col=1;col<=row;col++) {
	        	if(col==row) { 
	        		 System.out.print("*");
	       	}else {
	       		System.out.print("  ");
	        	}
	        	 
	         }System.out.println();
	        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int row,col;
		 for(row=1;row<=n;row++) {
        	 for(col=1;col<=row;col++) {
        		 System.out.print("  ");
        	 }
        	 for(col=row;col<n;col++) {
        		 if(col==row) { 
        		 System.out.print("* ");
        		 } else {
      		System.out.print("  ");
       		}
        	}
        		 
        	 for(col=row;col<=n;col++) {
        		 if(col==n) { 
        			 System.out.print("* "); 
        		 }
               else { 
               	 System.out.print("  "); 
               	}
                 
             }System.out.println();
         }*/
         

	}

}
