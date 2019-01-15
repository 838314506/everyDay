package volatileAndSynchronized;

public class VolatileTest2 {

	private volatile int inc = 0;
	//在此处使用sychronized关键字能够保证结果为50000
	public void increase() {
		inc++;
	}
	
	public static void main(String[] args) {
		final VolatileTest2 test = new VolatileTest2();
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
		//volatile具有可见性保证了变量对所有线程可见，但是不具有原子性
		//运行结果一定不会是50000，因为变量Inc不是原子操作，因此volatile不能保证原子性
		//volatile变量控制并发的场景
		//1、运算结果并不依赖变量的当前值，或者能够确保只有单一线程修改变量的值
		//2、变量不需要与其他的状态变量共同参与不变约束
		//3、禁止指令重排序优化
		System.out.println(test.inc);
	}
}
