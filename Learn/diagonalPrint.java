package Learn;

public class diagonalPrint {

	public static void main(String[] args) {
		int n=9;
		//int k=n;
		int m=(n+1)/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					//System.out.print(k);
					if(i<m) {
						System.out.print(((n-i)+1)+"");
					}
					else {
						System.out.print(i);
					}
				}
				else if(i+j==n+1) {
					//System.out.print(k);
					if(i<m) {
						System.out.print(i);
					}
					else {
						System.out.print(j);
					}
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			//k--;
		
			System.out.println("");
		}

	}

}
