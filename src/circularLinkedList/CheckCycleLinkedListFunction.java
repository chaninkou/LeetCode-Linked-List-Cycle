package circularLinkedList;

import java.util.HashSet;
import java.util.Set;

public class CheckCycleLinkedListFunction {
    public boolean hasCycle(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;
        
        // While none of them is null because non cycle LinkedList will have null
        while(runner != null && runner.next != null){
            // Walker will walk one step
            walker = walker.next;
            
            // Runner will run two step
            runner = runner.next.next;
            
            // They will eventually meet each other if they are circular
            if(walker == runner){
                return true;
            }
        }
        
        // return false if its a normal linked list
        return false;
    }
    
    public boolean hasCycle1(ListNode head){
    	Set<ListNode> set = new HashSet<>();
    	
    	while(head != null){
    		if(set.contains(head)){
    			return true;
    		} else {
    			set.add(head);
    		}
    		
    		head = head.next;
    	}
    	
    	return false;
    }
}
