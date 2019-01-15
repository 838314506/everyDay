package volatileAndSynchronized;

public class VolatileTest2 {

	private volatile int inc = 0;
	//�ڴ˴�ʹ��sychronized�ؼ����ܹ���֤���Ϊ50000
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
		//volatile���пɼ��Ա�֤�˱����������߳̿ɼ������ǲ�����ԭ����
		//���н��һ��������50000����Ϊ����Inc����ԭ�Ӳ��������volatile���ܱ�֤ԭ����
		//volatile�������Ʋ����ĳ���
		//1���������������������ĵ�ǰֵ�������ܹ�ȷ��ֻ�е�һ�߳��޸ı�����ֵ
		//2����������Ҫ��������״̬������ͬ���벻��Լ��
		//3����ָֹ���������Ż�
		System.out.println(test.inc);
	}
}
