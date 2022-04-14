package Learn;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Learn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};
		int [] b= {3,4,5,7};
		int x = a.length;
		int y =b.length;
		int c= x+y;
		int[] m = new int [c];
		for(int i=0;i<a.length;i++) {
			m[i]=a[i];
			}
	//	System.out.print(m.length);
		int g= 0;
	for(int i =0;i<b.length;i++) {
		int k=0;
		for(int j =0;j<m.length;j++) {
			if(b[i]==m[j]) {
				k=1;
				continue;
			}
	
		}
		if(k==0) {
		
			m[x+g]=b[i];
			g++;
		}
	}
	
	for(int i=0;i<m.length;i++) {
		if(m[i]!=0) {
			System.out.print(m[i]+" ");
		}
		
		}
		//System.out.print(Arrays.toString(m));
       }
}

