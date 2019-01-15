package threadDemo;

public class ThreeThreadDemo {
	public static void main(String[] args) {
		new ThreeNewThread("one");
		new ThreeNewThread("two");
		new ThreeNewThread("three");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		System.out.println("main thread exiting");
	}
}
