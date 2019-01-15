package threadDemo.notifyDemo;

public class Procuder implements Runnable{
	
	private Q q;
	
	public Procuder(Q q) {
		this.q = q;
		new Thread(this,"Producer").start();
	}

	@Override
	public void run() {
		int n = 0;
		while(true) {
			q.put(n++);
		}
	}

}
