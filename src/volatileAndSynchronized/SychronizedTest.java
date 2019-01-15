package volatileAndSynchronized;

public class SychronizedTest {
	private int inc = 0;
	
	//synchronized
	/**
	 * ��֤ԭ���ԣ��ɼ��ԣ������ԣ�ָ�����ţ�
	 * synchronizedִ�����̣�
	 * 1���̻߳�û�����
	 * 2����չ����ڴ�
	 * 3�������ڴ��п������±����ĸ����������ڴ�
	 * 4��ִ�������
	 * 5�������ĺ�Ĺ��������ֵˢ�µ��ڴ�
	 * 6���ͷŻ�����
	 * 
	 * synchronized���δ���ͷ����в��
	 * 1��ͬ���飺JVM����monitorenter��monitorexit����ָ����ʵ��ͬ��
	 * 2��������JVM����acc_synchronized��Ƿ���ʵ��ͬ��
	 * ��synchronizedͨ��������֤��ԭ�ӻ����ɼ��ԣ�������
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
