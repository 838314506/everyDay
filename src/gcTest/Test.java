package gcTest;

public class Test {

	MyObject ref;
	
	/**��ӡ������£�
	 * this is finalize
	 * myObject is live
	 * �ڳ���������finalize������ʱmyObject���һ���ɴ���󣬵����´λ��յ�ʱ��
	 * finalize�����Ѳ��ٻᱻ���ã���Ϊfinalize����ֻ�ᱻ����һ��
	 */
	public static void main(String[] args) {
		Test test = new Test();
		test.ref = new MyObject(test);
		test.ref = null;
		System.gc();
		if(test.ref != null) System.out.println("myObject is live");
	}
}
