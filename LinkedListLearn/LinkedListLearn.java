package LinkedListLearn;

class LinkedList{
	
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int val) {
			data=val;
			next=null; 
		}
	}
	
	LinkedList(){
		head=null;
	}
	
	public void insertAtBeginning(int val) {
		Node newnode= new Node(val);
		//List is empty
		if(head==null) {
			head=newnode;
		}
		else {//list is not empty
			 newnode.next=head;
			 head=newnode;
		}
	}
	
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public void insertAtPos(int pos,int val) {
		if(pos==0) {
			insertAtBeginning(val);
			return;
		}
		Node newnode= new Node(val);
		Node temp=head;
		for(int i=1;i<pos;i++) {
			temp=temp.next;
			if(temp==null) {
				//System.out.println("Invalid Position");
				throw new IllegalArgumentException("Invalid Position");
				//return;
			}
		}
		newnode.next=temp.next;
		temp.next=newnode;
	}
}

public class LinkedListLearn {

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.insertAtBeginning(5);
		list.insertAtBeginning(9);
		list.display();
		System.out.println();
		list.insertAtPos(5, 10);
		list.display();
	}

}
