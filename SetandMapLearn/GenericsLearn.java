package SetandMapLearn;

import java.util.ArrayList;
import java.util.TreeSet;

public class GenericsLearn {

	public static void main(String[] args) {
		int arr[]=new int[4];
		arr[0]=5;
		arr[1]=10;
		arr[2]=15;
			
		TreeSet ts= new TreeSet();
		
		ts.add(15);
		ts.add(10);
		ts.add(5);
		//ts.add("raja");
		ts.add((int)1.5);
		
		System.out.println(ts);

		ArrayList<String> al= new ArrayList<String>();
		al.add("hi");
		al.add("hello");
		
		System.out.println(al);
		
		GenericsLearn gl = new GenericsLearn ();
		gl.add(al);
	}

	private void add(ArrayList<String> al) {
		al.add("How ");
		System.out.println(al);
		
	}

}
