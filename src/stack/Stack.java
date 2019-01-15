package stack;

public class Stack {

	private int[] stack;

	private int tos;

	Stack(int length) {
		stack = new int[length];
		tos = -1;
	}

	//push a element onto the stack
	public void push(int item) {
		if (tos == stack.length)
			System.out.println("Stack is full.");
		else
			stack[++tos] = item;
	}
	
	//pop an item from stack
	public int pop() {
		if(tos < 0) {
			System.out.println("stack underflow.");
			return 0;
		}else
			return stack[tos--];
	}

}
