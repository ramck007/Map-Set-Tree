package SetandMapLearn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapandEntryLearn {

	public static void main(String[] args) {
		HashMap hm= new HashMap();
		hm.put("car",10);
		hm.put("bike", 20);
		hm.put("Cycle",5);
		hm.put("jeep",10);
	
		System.out.println(hm);
		
		Set s= hm.entrySet();
		System.out.println(s);
			
		Iterator i= s.iterator();
		
		while(i.hasNext()) {
			Object o=i.next();//Storing
			Map.Entry e= (Map.Entry)o;//type casting
			
			Object price= e.getValue();
			Object name = e.getKey();
			
			if(price.equals(10)) {
				System.out.println(name);
				e.setValue(30);
			}
			//System.out.println(e.getKey());
			//System.out.println(e.getValue());
			//System.out.println(i.next());
			if(name.equals("bike")){
				e.setValue(50);
			}
		}
		System.out.println(s);
		
		
		

		//Set s =hm.entrySet();			System.out.println(s);
		//Collection c = hm.values();	System.out.println(c);
		//Set s2= hm.keySet();			System.out.println(s2);
		
	}

}
