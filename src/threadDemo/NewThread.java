package threadDemo;
/**
 * ʵ��runnable�ӿڿ��Գ���һ����ִ�еĴ��뵥Ԫ����������ʵ�ָýӿڵĶ��󴴽�һ���̶߳���
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
