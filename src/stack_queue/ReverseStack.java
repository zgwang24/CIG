package stack_queue;

import java.util.Stack;

public class ReverseStack {
	public int getAndRemoveLastElement(Stack<Integer> s){
		int res = s.pop();
		if(s.isEmpty()){
			return res;
		}else{
			int last = getAndRemoveLastElement(s);
			s.push(res);
			return last;
		}
	}
	public void reverse(Stack<Integer> s){
		if(s.isEmpty()){
			return ;
		}
		int i = getAndRemoveLastElement(s);
		reverse(s);
		s.push(i);
	}
}
