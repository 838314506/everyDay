package threadDemo.suspendResume;

public class SuspendResume {
	
	public static void main(String[] args) {
		NewThread t1 = new NewThread("one");
		NewThread t2 = new NewThread("two");
		
		try {
			Thread.sleep(1000);
			t1.mysuspend();
			System.out.println("the first suspend");
			Thread.sleep(1000);
			t1.myresume();
			System.out.println("the first resume");
			t2.mysuspend();
			System.out.println("the second suspend");
			Thread.sleep(1000);
			t2.myresume();
			System.out.println("the second resume");
			
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		
		try {
			System.out.println("waiting for threads to finish");
			t1.t.join();
			t2.t.join();
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		
		System.out.println("main thread exiting");
	}

}
