package linked_list;

public class MergeTwoSortedList {
	public static ListNode merge(ListNode head1, ListNode head2){
		if(head1 == null && head2 == null){
			return null;
		}
		if(head1 == null || head2 == null){
			return head1 == null ? head2 : head1;
		}
		ListNode head = head1.getValue() < head2.getValue() ? head1 : head2; 
		return head;
	}
}
