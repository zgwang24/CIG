package linked_list;

public class ReverseListedNode {
	public static ListNode reverse(ListNode head){
		ListNode temp = null, nextNode = null;
		while(head != null){
			nextNode = head.getNext();
			head.setNext(temp);
			temp = head;
			head = nextNode;
		}
		return temp;
	}
}
