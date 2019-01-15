package threadDemo;

public class CurrenThreadDemo {

	public static void main(String[] args) {
		//��ȡ��ǰ���̣߳��õ��������ã��Դ������Ƹ��߳�
		Thread thread = Thread.currentThread();

		//current thread :Thread[main,5,main]δ�޸�֮ǰ��ӡ�Ľ��
		//[main,5,main]��ָ����Ϣ��ָ���߳����ƣ����ȼ����߳������߳�����Ϣ
		System.out.println("current thread :" + thread);
		thread.setName("My Thread");
		//after rename :Thread[My Thread,5,main]�޸�֮���ӡ�Ľ��
		System.out.println("after rename :" + thread);


		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(i);
				//�߳�˯��1��
				thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted");
		}
	}

}
