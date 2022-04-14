package SetandMapLearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class StringHashMapL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringHashMapL shs = new StringHashMapL();
		shs.countChar();
		//shs.countStringss();
		
	}

	private void countStringss() {
		String names="hi hello hi how are";
		String [] words= names.split(" ");
		HashMap<String,Integer> hm = new HashMap();
		for(String c:words) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		Set<Entry<String, Integer>> s= hm.entrySet();
		for(Map.Entry<String, Integer> ent:s) {
			if(ent.getValue()>1) {
				System.out.println(ent.getKey()+" : "+ent.getValue());
			}
		}
	}

	private void countChar() {
		String str = "muthuram";
		char [] ch= str.toCharArray();
		HashMap<Character,Integer> hm = new HashMap();
		for(char c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		System.out.println(hm.get('u'));
		Set<Entry<Character, Integer>> s= hm.entrySet();
		for(Map.Entry<Character, Integer> ent:s) {
			if(ent.getValue()==1) {
				System.out.println(ent.getKey()+" : "+ent.getValue());
			}
		}
		
	}

}
