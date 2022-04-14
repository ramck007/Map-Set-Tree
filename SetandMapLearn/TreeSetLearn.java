package SetandMapLearn;

import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetLearn {

	public static void main(String[] args) {
		String s="dommy";
		System.out.println(s);
		s=null;
		System.out.println(s);

		TreeSet ts= new TreeSet();
		
		ts.add(5);
		ts.add(1);
		ts.add(9);
		ts.add(5);
		ts.add(7);
		ts.add(0);
		
		System.out.println(ts);
		
		
		LinkedList ll = new LinkedList();
		ll.add(5);
		ll.add(2);
		ll.add(5);
		ll.add(4);
		ll.add(7);
		
		System.out.println(ll);
		
		TreeSet ts1= new TreeSet(ll);
		System.out.println(ts1);
		
		
	}

}
