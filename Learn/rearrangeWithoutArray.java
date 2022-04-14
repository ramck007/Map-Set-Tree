package Learn;

public class rearrangeWithoutArray {

		public static void main(String[] args) {

			int n=5;
			int s=4;// s=Start
			int val1=1,val2=1;
			for(int i=1;i<=n;i++) {
				for(int k=s;k<=n;k++) {
					val1++;
				}
				for(int j=1;j<s;j++) {
					System.out.print(val1++ +" ");
				}
				for(int j=s;j<=n;j++) {
					System.out.print(val2++ +" ");
				}
				val2=val1;
				System.out.println("");
			}
		}

}
