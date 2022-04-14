package Learn;

public class oddSumEvenMul {

	public static void main(String[] args) {
		int num=1420;
		int sum=0,mul=1,count=0;
		int k=num;
		while(num!=0) {
			num=num/10;
			count++;
		}
		while(k!=0) {
			if(count%2==0) {
				mul=mul*(k%10);
			}
			else {
				sum=sum+(k%10);
			}
			k=k/10;
			count--;
		}
		System.out.println("sum "+sum);
		System.out.println("mul "+mul);
	}

}
