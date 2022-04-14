package Learn;

public class ArrayDivbygivenNumber {

	public static void main(String[] args) {
		// int n=3  arr={40,50,90}    output = 1
		int n=3;
		int [] arr= {40,50,90};
		int r=0,s=0;
		for(int i=0;i<n;i++) {
			r=arr[i]%3;
			s+=r;
		}
		if(s%3==0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}
