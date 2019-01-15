package threadDemo.suspendResume;

public class NewThread implements Runnable{
	
	private String name;
	private boolean suspendFlag;
	public Thread t;
	
	public NewThread(String name) {
		this.name = name;
		t = new Thread(this,name);
		System.out.println("new thread :"+name);
		suspendFlag = false;
		t.start();
	}

	@Override
	public void run() {
		try {
			for(int i = 15;i > 0;i --) {
				System.out.println(name + " : " + i);
				Thread.sleep(200);
				synchronized (this) {
					while(suspendFlag) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println("new thread interrupted");
		}
		System.out.println(name + "exiting");
	}
	
	public synchronized void mysuspend() {
		suspendFlag = true;
	}
	
	public synchronized void myresume() {
		suspendFlag = false;
		notify();
	}

}
