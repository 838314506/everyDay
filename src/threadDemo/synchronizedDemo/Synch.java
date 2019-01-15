package threadDemo.synchronizedDemo;

public class Synch {
	
	public static void main(String[] args) {
		Callme target = new Callme();
		Caller obj1 = new Caller(target, "hello");
		Caller obj2 = new Caller(target, "synchonized");
		Caller obj3 = new Caller(target, "world");
		
		try {
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		} catch (InterruptedException e) {
			System.out.println("main interrupted");
		}
	}

}
