package TreeLearn;
import TreeLearn.BinaryTree;

public class BinaryTreeLearn {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(10);
		tree.insertleft(tree.root,5);
		tree.insertright(tree.root,15);
		tree.insertleft(tree.root.left,3);
		tree.insertright(tree.root.left,8);
		tree.insertleft(tree.root.right,12); 
		
		BinaryTree.preOrder(tree.root);
		System.out.println();
		BinaryTree.inOrder(tree.root);
		System.out.println();
		BinaryTree.postOrder(tree.root);
		
		
	}

}

