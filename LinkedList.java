
// Java program to find middle element of linkedList with only one iteration.
public class LinkedList {
	Node head; // head of the list
	
	/* LinkedList node*/
	public static class Node{
		
		private int data;
		private Node next;
		
		// Constructor
		public Node( int data) {
			
			this.next = null;
			this.data = data;
		}

}
 // Will use 2 pointers to iterate through the list at the same time.
 // fastPointer will move 2 steps at a time(per iteration), whereas slowPointer will move 1 step at a time.
 // when the fastPointer reaches the last node or null of the linkedList, slowPointer will be in the middle of the 
 // linkedList we have to return the slowPointer.
	
	/* function to print the middle of the linkedList */
	public void findMiddleElement(){
		Node steadyPointer = head;
		Node fastPointer = head;
		if(head != null) {
			while (fastPointer != null && fastPointer.next != null) {
				fastPointer = fastPointer.next.next;
				steadyPointer = steadyPointer.next;
			}
			System.out.println("The middle element is [" + steadyPointer.data + "] \n");
		}
	}
	/* To insert the new Node at front of the list*/
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		
		/* Make next of new Node to be the head */
		new_node.next = head;
		
		/* we move the head to point to new Node */
		head = new_node;
	}
	
	/* The function that prints contents of linkedList */
	public void printLinkedList() {
		Node sampleNode = head;
		while(sampleNode != null) {
			System.out.print(sampleNode.data+"-->");
			sampleNode = sampleNode.next;
		}
		System.out.println("NULL");
	}
	public static void main(String [] args) {
		LinkedList linkedList = new LinkedList();
		for(int i=100; i>0; --i) {
			linkedList.push(i);
		}
		linkedList.printLinkedList();
		linkedList.findMiddleElement();
	}
}
