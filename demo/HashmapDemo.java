package demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("tranzking", 1250);
		hm.put("parveen", 1450);
		hm.put("ybm", 1650);
		hm.put("lnt", 850);
		
		System.out.println(hm);
		Set s = hm.entrySet();
		System.out.println(s);
		
		Iterator i = s.iterator();
		
		while(i.hasNext())
		{
			Object o = i.next();
			Map.Entry e = (Map.Entry)o;
			Object price = e.getValue();
			Object bus = e.getKey();
			
			if(bus.equals("tranzking"))
			{
				e.setValue(1500);
			   }
			}
			System.out.println(s);
				//System.out.println(bus);
			//System.out.println(e.getKey());
			//System.out.println(e.getValue());
		}
		
		
		
		
//		hm.put("siva", 23);
//		hm.put("walls", 26);
//		hm.put("arun", 21);
//		hm.put("arun", 23);
//		System.out.println(hm);
//		Set<?> s = hm.entrySet();
//		System.out.println(s);
//		
//		Collection<Integer> c = hm.values();
//		System.out.println(c);
//		
//		System.out.println(hm.keySet());
//		
//		
//		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
//		
//		hm2.putAll(hm);
//		
//		System.out.println(hm2.containsKey("walls"));
//		System.out.println(hm2.containsValue(26));
//		System.out.println(hm2);
//		System.out.println(hm2.get("arun"));
//		System.out.println(hm2.remove("arun"));
//		System.out.println(hm2);
//		System.out.println(hm2.size());
//		System.out.println(hm2.isEmpty());
//		hm2.clear();
//		System.out.println(hm2.isEmpty());
		

	}


