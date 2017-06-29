package linked_list;

public class Test {
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(2);
		ListNode n5 = new ListNode(1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		// PrintCommonPart.print(n1, n3);
		// ListNode head = RemoveLastKthNode.remove(n1, 3);
		// ListNode head = ReverseListedNode.reverse(n1);
		System.out.println(IsPalindrome.isPalindrome1(n1));
		System.out.println(IsPalindrome.isPalindrome2(n1));
	}	
}
