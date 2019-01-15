package threadDemo;

public class ThreadDemo {
	/**在此过程中当前类中的方法为主线程，所有程序必须是主线程先开始进行执行
	 * 因此，在此主方法中，先进入子线程中的构造方法中打印语句，接下来，打印主线程运行的结果
	 * 如果在睡眠时间里设置与子线程相同的时间，那么可能 会导致子线程最后结束，导致主线程挂起
	 * 所以在设置时间时，主线程的睡眠时间应该比子线程的睡眠时间长一些以此来保证主线程最后执行完毕
	 * @param args
	 */
	public static void main(String[] args) {
		new NewThread();
		
		try {
			for(int i = 5;i > 0;i --) {
				System.out.println("main thread :"+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		System.out.println("main thread exiting");
	}

}
