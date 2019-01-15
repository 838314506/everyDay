package interfaceTest.stack;

public interface InStack {
	public void push(int item);
	public int pop();
	
	//������Խ��е���
	default void clear() {
		System.err.println("clear the stack!");
	}
	
	//��̬����������Խ��е���
	static void get() {
		System.out.println("this is a static method");
	}
}
