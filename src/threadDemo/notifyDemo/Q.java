package threadDemo.notifyDemo;

public class Q {
	
	private int n;
	private boolean valueSet = false;
	
	public synchronized int get() {
		
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Got :"+n);
		valueSet = false;
		notify();
		return n;
	}
	
	//在此过程中，消费者会被先挂起，由生产者进行生产数据，之后notify通知消费线程，当前生产者休眠
	//消费者将队列 中的消息进行消费后，进入休眠，通知生产者生产数据，周而复始
	//在这其中的wait和notify两个方法直到了互相通知和自我限制的作用。
	public synchronized void put(int n) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.n = n;
		valueSet = true;
		System.out.println("Put :"+n);
		notify();
	}

}
