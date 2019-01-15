package interfaceTest.stack;

public class DynStack implements InStack{
	
	private int[] stack;
	private int tos;
	
	public DynStack(int size) {
		stack = new int[size];
		tos = -1;
	}

	@Override
	public void push(int item) {
		if(tos == stack.length - 1) {
			int[] temp = new int[stack.length * 2];
			for(int i = 0;i < stack.length;i ++) {
				temp[i] = stack[i];
			}
			stack = temp;
			temp = null;
			stack[++tos] = item;
		}else {
			stack[++tos] = item;
		}
	}

	@Override
	public int pop() {
		if(tos < 0) {
			System.out.println("stack updateflow");
			return 0;
		}
		//super关键字的一个用途，调用接口中的默认方法
//		InStack.super.clear();
		return stack[tos--];
	}
	
	
	public static void main(String[] args) {
//		DynStack dynStack = new DynStack(5);
//		DynStack dynStack2 = new DynStack(8);
//		
//		for(int i = 0;i < 12;i++) dynStack.push(i);
//		for(int i = 0;i < 20;i++) dynStack2.push(i);
//		
//		System.out.println("this is dynstack");
//		for(int i = 0;i < 12;i++) 
//			System.out.print(dynStack.pop() + "   ");
//		System.out.println();
//		System.out.println("this is dynstack2");
//		for(int i = 0;i < 20;i++) 
//			System.out.print(dynStack2.pop() + "  ");
//		System.out.println();
//		InStack.get();
		try {
			int d = 0;
			int x = 100/d;
		} catch (Exception e) {
			System.out.println("here happen exception"+e.getMessage());
		}
		System.out.println("here is outer");
	}
	

}
