package string;

import java.util.Scanner;

public class RoughWork_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String:");
		String s = sc.nextLine();
	    reversestring(s);
	}
	
	
	 static String reversestring(String s) {
		if(s.isEmpty()) 
			return s;
		
		
		else 
		System.out.print(s.charAt(s.length()-1));
		
		return reversestring(s.substring(0, s.length()-1));
      }
	 }

//	static String reversestring(String s) {
//		if(s.isEmpty()) 
//			return s;
//		return reversestring(s.substring(1))+s.charAt(0);
//	  }
//	 }






























//        String w="";s+=" "; int count=0;
//        for(int i=0;i<s.length();i++) {
//        	char c = s.charAt(i);
//            if(!Character.isWhitespace(c))
//        		w+=c;
//        	else {
//        		//if(w.equalsIgnoreCase("OR"))
//        			count++;
//char f = w.charAt(0);
//char l = w.charAt(w.length()-1);
//if(w.length()>lw.length())
//lw = w;
//System.out.println(w);
//System.out.println("\n"+w.charAt(0));
//System.out.println(w.substring(0, 2));

//        		w="";
//        	}      	
//           }
//if(count==0)System.out.print("Not found");
//else System.out.print("Found");
//System.out.print("Longest word :"+lw);
//System.out.print("No of Words:"+ count);
//          }
//	    }
