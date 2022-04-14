package Learn;

public class SortInAscAndDesc {

	public static void main(String[] args) {
		int []arr= {2,6,1,3,4,5,8,7,9};// {2,6,9,1,3,5}; //{2,6,9,3,1,5};//2 9 1 // 6 3 5
		//boolean flag;
		for(int i=0;i<arr.length-2;i=i+2) {
			for(int j=i+2;j<arr.length-2;j=j+2) {
			//flag=true;
			if(arr[i]>arr[j]) {
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
				//i=i-2;
				//i=i-2;
				//flag=false;	
			}
		//	if(flag) {
			//	continue;
			//}
			}
		}
		for(int i=1;i<arr.length-2;i=i+2) {
			for(int j=i+2;j<arr.length-1;j=j+2) {
			if(arr[i]<arr[j]) {
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
				//i=i-2;
			}
			}
		}
		
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}

}
