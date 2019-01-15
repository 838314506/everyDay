package exceptinTest;

public class ThrowDemo {
	
	public static void demoproc() {
		try {
			//
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {
			System.out.println("caught inside demoproc");
			throw e;
		}
	}

	/**
	 * 方法执行完毕后打印的结果：
	 * caught inside demoproc
	 * recaughtjava.lang.NullPointerException: demo
	 * 注意：在这里调用方法时try块中虽然抛出一个异常，但是仍然会正常地被catch到，catch中再抛出一个
	 * 		异常，在方法调用方又会捕捉一次，所以会打印上示结果
	 */
	
	public static void main(String[] args) {
		try {
			demoproc();
		} catch (NullPointerException e) {
			System.out.println("recaught" + e);
		}
	}
}
