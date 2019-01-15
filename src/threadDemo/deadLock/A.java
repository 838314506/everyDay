package threadDemo.deadLock;

public class A {
	
	public synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		
		System.out.println(name + "entered A.foo");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("thread interrupted");
		}
		
		System.out.println(name + "trying to call B.last");
		
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("inside A.last");
	}

}