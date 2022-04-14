package TreeLearn;

import java.util.Scanner;

public class BinarySearchTreeLearnMn {

	public static void main(String[] args) {
		BinarySearchTreeLearn bst = new BinarySearchTreeLearn(50);
		/*int n=5;
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<n;i++) {
			System.out.print("Enter the Value : ");
			n=sc.nextInt();
			bst.insertval(bst.root, n);
		}
		System.out.println();*/
		
		bst.insertval(bst.root, 20);
		bst.insert(70);
		bst.insert(10);
		bst.insert(25);
		bst.insert(60);
		bst.insert(90);
		
		
		
		bst.inOrder(bst.root);
		System.out.println();
		
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Value : ");
		n=sc.nextInt();
		
		if(bst.search(bst.root, 70) == null) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Found");
		}
		bst.inOrder(bst.root);
		System.out.println();
		bst.delete(bst.root,60);
		System.out.println();
		bst.inOrder(bst.root);
 
	}

}
