package SetandMapLearn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapLearn {

	public static void main(String[] args) {
		HashMap hm= new HashMap();
		hm.put(01, "yamaha");
		hm.put(02, "bajaj");
		hm.put(03, "pulsar");
		hm.put(04, "harley");
		hm.put(05, "bently");
		System.out.println(hm);
		
		System.out.println(hm.containsKey(3));
		System.out.println(hm.containsValue("pulsar"));	
		
		Set s= hm.keySet();
		System.out.println("Keys are "+s);
		
		Collection c= hm.values();
		System.out.println("Values are "+c);
		
		Set s2=hm.entrySet();
		System.out.println("Entries are "+s2);
		
		Iterator i=s2.iterator();
		while(i.hasNext()) {
			Map.Entry me=(Map.Entry) i.next();
			//System.out.println(i.next());
			//me.getKey();
			///me.getValue();
			//System.out.println(me.getKey()+" : "+me.getValue());
			
			if(me.getKey().equals(3)) {
				me.setValue("Ns");
			}
			//System.out.println(me.getKey()+" : "+me.getValue());
			System.out.println(me);
		}
	System.out.println(hm);	
	}
	
}
