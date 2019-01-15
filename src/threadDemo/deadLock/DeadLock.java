package threadDemo.deadLock;

public class DeadLock implements Runnable{
	A a = new A();
	B b = new B();
	
	DeadLock(){
		Thread.currentThread().setName("main thread");
		Thread t = new Thread(this, "racingThread");
		t.start();
		a.foo(b);
		System.out.println("back in main thread");
	}

	@Override
	public void run() {
		b.bar(a);
		System.out.println("back in other thread");
	}
	
	public static void main(String[] args) {
		new DeadLock();
	}
}