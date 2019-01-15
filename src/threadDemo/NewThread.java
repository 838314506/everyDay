package threadDemo;
/**
 * 实现runnable接口可以抽象一个可执行的代码单元，可以依托实现该接口的对象创建一个线程对象
 * @author lzz
 *
 */
public class NewThread implements Runnable{
	
	Thread t;

	public NewThread() {
		t = new Thread(this,"demoThread");
		System.out.println("child thread is :"+t);
		t.start();
	}
	
	@Override
	public void run() {
		try {
			for(int i = 5;i > 0;i --) {
				System.out.println("child thread :"+i);
				t.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("child interrupted");
		}
		System.out.println("child exiting");
	}

}
