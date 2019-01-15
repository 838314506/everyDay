package threadDemo;

public class ThreadDemo2 {

	public static void main(String[] args) {
		new NewThread2();
		try {
			for(int i = 5;i > 0;i --) {
				System.out.println("main thread:"+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("main interrupted");
		}
		System.out.println("main exiting");
	}
}
