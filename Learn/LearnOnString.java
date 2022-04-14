package Learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LearnOnString {
	
	public static void method1() {
		
		String s= "a2b3c4";
		char [] ch= s.toCharArray();
		for(int i=0;i<s.length();) {
			/*if(Character.isAlphabetic(ch[i])){
				char k=ch[i];
			}else {
				int a=ch[i];
			}*/
			char k=ch[i];
			int a = ch[i+1];
			char z = ch[i+1];
		//	System.out.print(Character.getNumericValue(z));
			a=a-48;
			//System.out.println(a-48);
			for(int j=0;j<a;j++) {
				System.out.print(k);
			}
			i=i+2;
		}

	}
	public static void method2() {
		String s="aabbbcccc";
		HashMap<Character,Integer> hm = new HashMap<>();
		char [] ch= s.toCharArray();
		for(char c:ch) {
			if((hm.containsKey(c))) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> ss= hm.entrySet();
		for(Map.Entry<Character, Integer> ent:ss) {
			
				System.out.print(ent.getKey()+""+ent.getValue());
			
		}
		//System.out.println(hm);
	}
public static void method3() {
	String s= "a12b32c14";
	char temp;
	int num=0;
	char [] ch= s.toCharArray();
	for(int i=0;i<s.length();i++) {
		if(ch[i]>='0' && ch[i]<='9') {
			temp=ch[i-1];
			while(i<s.length() && ch[i]>='0' && ch[i]<'9' ) {
				num= (num*10)+(ch[i]-48);
				i++;
			}
			for(int j=0;j<num;j++) {
				System.out.print(temp);
			}
		}
		num=0;
	}
}
	public static void main(String[] args) {
		method3();
		
	}

}
