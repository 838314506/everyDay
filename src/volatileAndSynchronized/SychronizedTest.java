package volatileAndSynchronized;

public class SychronizedTest {
	private int inc = 0;
	
	//synchronized
	/**
	 * 保证原子性，可见性，有序性（指令重排）
	 * synchronized执行流程：
	 * 1、线程获得互斥锁
	 * 2、清空工作内存
	 * 3、在主内存中拷贝最新变量的副本到工作内存
	 * 4、执行完代码
	 * 5、将更改后的共享变量的值刷新到内存
	 * 6、释放互斥锁
	 * 
	 * synchronized修饰代码和方法有差别
	 * 1、同步块：JVM采用monitorenter、monitorexit两个指令来实现同步
	 * 2、方法：JVM采用acc_synchronized标记符来实现同步
	 * 即synchronized通过加锁保证了原子怀，可见性，有序性
	 */
	public synchronized void increase() {
		inc ++;
	}
	
	public static void main(String[] args) {
		final SychronizedTest test = new SychronizedTest();
		for(int i = 0;i < 5;i++) {
			new Thread() {
				public void run() {
					for(int j = 0;j < 10000;j++) {
						test.increase();
					}
				};
			}.start();
		}
		while(Thread.activeCount() > 2)
			Thread.yield();
		System.out.println(test.inc);
	}
}
