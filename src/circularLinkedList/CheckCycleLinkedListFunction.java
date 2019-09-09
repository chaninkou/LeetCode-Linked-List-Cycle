package circularLinkedList;

public class CheckCycleLinkedListFunction {
    public boolean hasCycle(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;
        
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
        
        return false;
    }
}