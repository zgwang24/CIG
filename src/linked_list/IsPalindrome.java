package linked_list;

import java.util.Stack;

public class IsPalindrome {
	public static boolean isPalindrome1(ListNode head){
		Stack<ListNode> stack = new Stack<ListNode>();
		ListNode cur = head;
		while(cur != null){
			stack.push(cur);
			cur = cur.getNext();
		}
		while(head != null){
			if(head.getValue() != stack.pop().getValue()){
				return false;
			}
			head = head.getNext();
		}
		return true;
	}
	public static boolean isPalindrome2(ListNode head){
		if(head == null || head.getNext() == null){
			return true;
		}
		ListNode cur = head;
		ListNode right = head;
		while(cur.getNext() != null && cur.getNext().getNext() != null){
			right = right.getNext();
			cur = cur.getNext().getNext();
		}
		Stack<ListNode> stack = new Stack<ListNode>();
		while(right != null){
			stack.push(right);
			right = right.getNext();
		}
		while(!stack.isEmpty()){
			if(head.getValue() != stack.pop().getValue()){
				return false;
			}
			head = head.getNext();
		}
		return true;
	}
	// null
	public static boolean isPalindrome3(ListNode head){
		return true;
	}
}
