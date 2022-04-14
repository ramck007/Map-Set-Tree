package SetandMapLearn;

import java.util.TreeMap;

public class TreeMapLearn {

	public static void main(String[] args) {

		TreeMap tm = new TreeMap();
		tm.put(101, "Hi");
		tm.put(102, "Hello");
		
		TreeMap tm2 = new TreeMap();
		
		tm2.putAll(tm);
		
		tm2.put(105, "How");
		tm2.put(104, "you");
		
		System.out.println(tm);
		System.out.println(tm2);
		
		System.out.println(tm2.firstEntry());
		System.out.println(tm2.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm2.lastEntry());
		
		
		
		
	}

}
