package sleepSort;

/**
 * ˯��������⣺
 * 	 ����cpu������ǰ����һ������ʱ�䣬�ڲ�ͬ���������߳��̲�ͬ���������ʱ��̵����־ͻ�ռ��cpu
 *	 �Ӷ���ǰ��ӡ�����մﵽһ�������Ч��������������ֲ���Ϊ����������̫����ܻᵼ���߳�һֱ˯�ߡ�
 * @author lzz
 *
 */
public class SleepSort implements Runnable{
	
	private int num;
	
	public SleepSort(int num) {
		this.num = num;
	}
	
	public static void main(String[] args) {
		int[] aa = {1,9,8,3,7,5,4,2,6};
		for(int i = 0;i < aa.length;i ++) {
			new Thread(new SleepSort(aa[i])).start();
		}
	}

	@Override
	public void run() {
		try {
			Thread.sleep(num * 10 + 10);
			System.out.println(num);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
