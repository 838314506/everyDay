package threadDemo;

public class ThreeNewThread implements Runnable{
	
	private String threadName;
	public Thread t;

	public ThreeNewThread(String threadName) {
		this.threadName = threadName;
		t = new Thread(this,this.threadName);
		System.out.println("child thread");
		t.start();
	}
	
	@Override
	public void run() {
		try {
			for(int i = 5;i > 0;i --) {
				System.out.println(threadName +" :"+i);
				t.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(threadName + " thread interrupted");
		}
		System.out.println(threadName + " exiting");
	}

}
