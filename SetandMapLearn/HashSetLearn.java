package SetandMapLearn;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class HashSetLearn {
	public String toString(){
		return "Booo";
	}

	public static void main(String[] args) {
		
		HashSetLearn hsl= new HashSetLearn();
		
		HashSet hs= new HashSet();
		
		hs.add(5);
		hs.add(10);
		hs.add(15);
		hs.add(20);
		hs.add(hsl);
		
		System.out.println(hs);
		
		
		LinkedHashSet hs1= new LinkedHashSet();
		
		hs1.add(51);
		hs1.add(4);
		hs1.add(155);
		hs1.add(20);
		
		System.out.println(hs1);
		
		Object [] a=hs1.toArray();
		for(Object k:a) {
			System.out.println(k);
		}
		
		System.out.println(hs1);
		
		System.out.println(a[2]);
		
		LinkedList ll= new LinkedList<>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(30);
		ll.add(40);
		ll.add(10);
		//ll.add(hsl);
		
		System.out.println(ll);
		
		
		LinkedHashSet lhs= new LinkedHashSet(ll);
		System.out.println(lhs);
		
		
		
	}

}
