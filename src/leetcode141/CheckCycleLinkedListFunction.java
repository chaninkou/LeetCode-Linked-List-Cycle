package leetcode141;

import java.util.HashSet;
import java.util.Set;

public class CheckCycleLinkedListFunction {
	// slow and fast pointer pointers methods
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
    
    // Using a hashset to store node that we seen before
    public boolean hasCycle1(ListNode head){
    	Set<ListNode> set = new HashSet<>();
    	
    	while(head != null){
    		// Check if its already in hashset
    		if(set.contains(head)){
    			return true;
    		} else {
    			set.add(head);
    		}
    		
    		// update pointer
    		head = head.next;
    	}
    	
    	return false;
    }
}
