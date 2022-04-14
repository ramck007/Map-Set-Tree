package TreeLearn;

import TreeLearn.BinaryTree.Node;

public class BinarySearchTreeLearn {

	Node root;
	class Node{
		int key;
		Node left,right;
		
		public Node(int val){
			key = val;
			left = right= null;
		}
	}
	public BinarySearchTreeLearn(int val) {
		root = new Node(val);
	} 
	public BinarySearchTreeLearn() {
		root = null;
	}
	
	public void insert(int val) {
		insertval(root,val);
	}
	
	public Node insertval(Node root, int val) {
		if(root==null) {
			return new Node(val);
		}
		if(val<root.key) {
			root.left=insertval(root.left,val);
		}
		else {
			root.right=insertval(root.right,val);
		}
		return root;
		
	}
	
	public static void inOrder(Node root) {
		if(root!=null) {
			inOrder(root .left);
			System.out.print(root.key+" ");
			inOrder(root.right);
		 }
	}
	
	public Node search(Node root,int val) {
		if(root==null || root.key == val) {
			return root;
		}
		
		if(val<root.key) {
			return search(root.left,val);
		}
		else {
			return search(root.right,val);
		}
	}
	public Node delete(Node root, int val) {
		if(root==null) {
			return root;
		}
		if(val<root.key) {
			root.left=delete(root.left,val);
		}
		else if(val>root.key) {
			root.right=delete(root.right,val);
		}
		else {
			if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			else {
				root.key=min(root.right);
				root.right=delete(root.right,root.key);
			}
		}
		return root;	
	}
	private int min(Node right) {
		int minval=root.key;
		while(root.left!=null) {
			minval=root.left.key;
			root=root.left;
		}
		return minval;
	}
	
	

}
