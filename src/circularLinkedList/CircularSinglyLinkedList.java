package circularLinkedList;

public class CircularSinglyLinkedList {
	private ListNode last;
	private int length;
	
	public CircularSinglyLinkedList(){
		last = null;
		length = 0;
	}
	
	public int length(){
		return length;
	}
	
	public boolean isEmpty(){
		return length == 0;
	}
	
	public ListNode insertNode(int[] input){
		ListNode dummyRoot = new ListNode(0);
		ListNode previous = dummyRoot;
		
		for(int item : input){
			previous.next = new ListNode(item);
			previous = previous.next;
		}
	
		return dummyRoot.next;
	}
	
	public void displayLinkedList(ListNode head){
		ListNode current = head;
		
		while(current != null){
			System.out.print(current.val + " ");
			
			current = current.next;
		}
		
		System.out.println(" ");
	}
}
