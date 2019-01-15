package threadDemo.synchronizedDemo;

public class Caller implements Runnable{
	
	private String msg;
	private Callme target;
	public Thread t;
	
	public Caller(Callme target,String msg) {
		this.msg = msg;
		this.target = target;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		synchronized (target) {
			target.call(msg);
		}
	}

}
