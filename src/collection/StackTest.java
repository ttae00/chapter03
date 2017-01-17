package collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack= new Stack<String>();
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("도우넛");
		stack.push("희동이");
		
		System.out.println(stack.isEmpty());
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());	
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		
		//stack.pop(); //비어있는 경우 예외 발생
	}

}
