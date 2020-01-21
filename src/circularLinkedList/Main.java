package circularLinkedList;

public class Main {
	public static void main(String[] args) {
		CircularSinglyLinkedList list = new CircularSinglyLinkedList();
		
		int[] input = {3,2,0,-4};
		ListNode head = list.insertNode(input);
		
		list.displayLinkedList(head);
		
		head.next.next.next.next = head;
		
		CheckCycleLinkedListFunction solution = new CheckCycleLinkedListFunction();
		
		System.out.println(solution.hasCycle1(head));
		
	}
}
