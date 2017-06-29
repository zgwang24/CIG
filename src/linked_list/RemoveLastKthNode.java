package linked_list;

public class RemoveLastKthNode {
	public static ListNode remove(ListNode head, int k){
		if(head == null || k < 1){
			return head;
		}
		ListNode current = head;
		while(current != null){
			k--;
			current = current.getNext();
		}
		if(k == 0){
			head = head.getNext();
		}
		if(k < 0){
			current = head;
			while(++k != 0){
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
		}
		return head;
	}
}
