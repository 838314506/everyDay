package threadDemo.synchronizedDemo;

public class Callme {
	
	//在此加上synchronized关键字，可以达到同步的效果，另外一种方法请参照Caller中的run方法
	public void call(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("child thread interrupted");
		}
		System.out.println("]");
	}

}
