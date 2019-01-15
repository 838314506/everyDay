package threadDemo.notifyDemo;

public class Q {
	
	private int n;
	private boolean valueSet = false;
	
	public synchronized int get() {
		
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Got :"+n);
		valueSet = false;
		notify();
		return n;
	}
	
	//�ڴ˹����У������߻ᱻ�ȹ����������߽����������ݣ�֮��notify֪ͨ�����̣߳���ǰ����������
	//�����߽����� �е���Ϣ�������Ѻ󣬽������ߣ�֪ͨ�������������ݣ��ܶ���ʼ
	//�������е�wait��notify��������ֱ���˻���֪ͨ���������Ƶ����á�
	public synchronized void put(int n) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.n = n;
		valueSet = true;
		System.out.println("Put :"+n);
		notify();
	}

}
