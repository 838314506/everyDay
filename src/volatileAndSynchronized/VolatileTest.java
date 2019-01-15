package volatileAndSynchronized;

public class VolatileTest extends Thread{
	
	volatile boolean flag = false;
	int i = 0;
	
	public void run() {
		while(!flag) {
			i ++;
		}
	}
	
	public static void main(String[] args) throws Exception {
		VolatileTest test = new VolatileTest();
		test.start();
		test.sleep(2000);
		test.flag = true;
		System.out.println("test = "+test.i);
	}
}
