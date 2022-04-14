package Learn;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.next();
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);
			if(ch1==ch) {
				count++;
			}
		}
		System.out.println("The Given Character "+ch+" is present "+count+" times." );
		

	}

}
