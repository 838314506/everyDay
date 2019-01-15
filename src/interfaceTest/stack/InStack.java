package interfaceTest.stack;

public interface InStack {
	public void push(int item);
	public int pop();
	
	//子类可以进行调用
	default void clear() {
		System.err.println("clear the stack!");
	}
	
	//静态方法子类可以进行调用
	static void get() {
		System.out.println("this is a static method");
	}
}
