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
	
	// Display
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	//Insert - Insert at Beginning
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
	
	// Insert - Insert at Position
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
	
	// Insert - Insert at End
	public void insertAtEnd(int val) {
		Node temp=head;
		Node newNode = new Node(val);
		if(head==null) {
			head=newNode;
		}
		else {
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	
	//Delete - Delete at beginning
	public void deleteAtBeginning() {
		if(head==null) {
			throw new IndexOutOfBoundsException("Its Empty Dude");
		}
		head= head.next;
	}
	
	// Delete - Delete at position
	public void deleteAtPos(int pos) {
		if(head==null) {
			throw new IndexOutOfBoundsException("Deletion at invalid Position");
		}
		if(pos==0) {
			head=head.next;
			return;
		}
		
		Node temp=head;
		Node prev=null;
		
		for(int i=1;i<=pos;i++) {
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next;
	}
	
	//Delete - Delete at End
	public void deleteAtEnd() {
		Node temp=head;
		Node prev=null;
		while(temp.next!=null) {
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
	}
	
	// Get Index or postion for particular value
	public void getIndex(int val) {
		Node temp=head;
		int count=0;
		int pos=0;
		//System.out.println(temp.data);
		while(temp!=null) {
			if(temp.data==val) {
				pos=count;
			}
			count++;
			temp=temp.next;
		}
		System.out.println(pos);
	}
	
	// Get value for the particular position or index
	public void getVal(int pos) {
		Node temp=head;
		for(int i=0;i<pos;i++) {
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	// update the specific with given value
	public void update(int pos,int val) {
		Node temp=head;
		for(int i=1;i<pos;i++) {
			temp=temp.next;
		}
		temp.data=val;
	}
	
	// Search a particular value and return its index
	public void search(int val) {
		Node temp = head;
		int count=0;
		while(temp.next!=null) {
			if(temp.data==val) {
				System.out.println("\nThe given value "+val+" Found at index : "+count);
				return;
			}
			count++;
			temp=temp.next;
		}
	}
	
	//The Given value Contains or not
	public boolean contains(int val) {
		boolean boo=false;
		Node temp = head;
		while(temp.next!=null) {
			if(temp.data==val) {
				return boo=true;
			}
			temp=temp.next;
		}
		return boo;
	}
	
	// To Find the length of the list
	public void length() {
		Node temp= head;
		int count=1;
		while(temp.next!=null) {
			count++;
			temp=temp.next;
		}
		System.out.println("\nThe Length of th Given List is"+count);
	}
	
	// To Reverse a given Linked List
	public void reverse() {
		Node prev=null;
		Node temp=head;
		Node next=head.next;
		
		while(temp!=null) {
			
			next=temp.next;
			
			temp.next=prev;
			prev=temp;
			temp=next;
		}
		head=prev;
	}
	
	public void check() {
		LinkedList list= new LinkedList();
		list.insertAtBeginning(5);
		list.insertAtBeginning(9);
		list.insertAtBeginning(3);
		list.insertAtBeginning(2);
		list.display();
		System.out.println();
		list.insertAtPos(1, 10);
		list.display();
		System.out.println();
		list.deleteAtPos(2);
		list.display();
		System.out.println();
		list.getIndex(10);
		System.out.println();
		list.getVal(0);
		list.update(3, 7);
		System.out.println();
		list.display();
		list.deleteAtEnd();
		System.out.println();
		list.display();
		System.out.println();
		list.insertAtEnd(3);
		list.display();
		
		//list.search(3);
		list.search(10);
		
		System.out.println(list.contains(7));
		list.length();
	}
}

public class LinkedListLearn {

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		//list.check();
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(3);
		list.insertAtEnd(4);
		list.insertAtEnd(5);
		list.display();
		System.out.println();
		list.reverse();
		list.display();
	}

}
