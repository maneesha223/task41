package task41;

public class main_class {
	boolean hasCycle(Node head) {
	    if (head == null)
	        return false;
	    
	    Node slow = head; // moves 1 Node at a time
	    Node fast = head; // moves 2 Nodes at a time
	    
	    while (fast != null && fast.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;
	        if (slow == fast) {
	            return true; // since "slow" and "fast" collided
	        }
	    }
	    return false;
	}

}
