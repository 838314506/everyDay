package threadDemo;

public class ThreadDemo {
	/**�ڴ˹����е�ǰ���еķ���Ϊ���̣߳����г�����������߳��ȿ�ʼ����ִ��
	 * ��ˣ��ڴ��������У��Ƚ������߳��еĹ��췽���д�ӡ��䣬����������ӡ���߳����еĽ��
	 * �����˯��ʱ�������������߳���ͬ��ʱ�䣬��ô���� �ᵼ�����߳����������������̹߳���
	 * ����������ʱ��ʱ�����̵߳�˯��ʱ��Ӧ�ñ����̵߳�˯��ʱ�䳤һЩ�Դ�����֤���߳����ִ�����
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
