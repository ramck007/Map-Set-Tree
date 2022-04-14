package Learn;

public class SumofSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,7,15};
		int sum=12;
		int n= arr.length;
		for(int i=0;i<n;i++) {
			int s=0;
			for(int j=i;j<n;j++) {
				s+=arr[j];
				if(s==sum) {
					System.out.print(i+1+" to "+(j+1)+" ");
				}
				
			}
		}
	}

}
