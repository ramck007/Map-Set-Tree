package SetandMapLearn;

import java.util.HashMap;
import java.util.TreeMap;

public class StringMapLearn {

	public static void main(String[] args) {
		
		String s = "ammaappa";
		char [] ch= s.toCharArray();
		
		HashMap <Character,Integer> charCount= new HashMap();
		for(char c:ch) {
			//System.out.println(c);
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
				//System.out.println(charCount.get(c));
			}
			else {
				charCount.put(c,1);
			}	
		}
		System.out.println(charCount);
		
		TreeMap <Character,Integer> charCount1= new TreeMap();
		for(char c:ch) {
			//System.out.println(c);
			if(charCount1.containsKey(c)) {
				charCount1.put(c, charCount1.get(c)+1);
			}
			else {
				charCount1.put(c,1);
			}
		}
		System.out.println(charCount1);
	}

}
