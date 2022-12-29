package demo;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Ram");
		names.add("Siva");
		names.add("Cherry");
		
		System.out.println(names);
	    ListIterator<String> l = names.listIterator();
	    l.add("Hari");
		    
			while(l.hasNext())
				
			{
				if(l.next().equals("Ram"))
				{
					l.set("Guru");
				}
				//System.out.println(l.next());
				}
                System.out.println(names);
	       }
	}
