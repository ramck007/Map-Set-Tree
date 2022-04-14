package Learn;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		int total=5;
		int sum=0;
		int n= arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(total==arr[i]+arr[j]) {
					System.out.println(i+" "+j);
				}
				
			}
		}
	}

}
