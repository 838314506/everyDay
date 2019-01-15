package gcTest;

public class Test {

	MyObject ref;
	
	/**打印结果如下：
	 * this is finalize
	 * myObject is live
	 * 在程序运行至finalize方法中时myObject变成一个可达对象，但是下次回收的时候，
	 * finalize方法已不再会被调用，因为finalize方法只会被调用一次
	 */
	public static void main(String[] args) {
		Test test = new Test();
		test.ref = new MyObject(test);
		test.ref = null;
		System.gc();
		if(test.ref != null) System.out.println("myObject is live");
	}
}
