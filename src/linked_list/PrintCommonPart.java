package linked_list;

public class PrintCommonPart {
	public static void print(ListNode head1, ListNode head2){
		while(head1 != null && head2 != null){
			if(head1.getValue() < head2.getValue()){
				head1 = head1.getNext();
			}else if(head1.getValue() > head2.getValue()){
				head2 = head2.getNext();
			}else{
				System.out.print(head1.getValue() + " ");
				head1 = head1.getNext();
				head2 = head2.getNext();
			}
		}
	}
}
