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
	 * ����ִ����Ϻ��ӡ�Ľ����
	 * caught inside demoproc
	 * recaughtjava.lang.NullPointerException: demo
	 * ע�⣺��������÷���ʱtry������Ȼ�׳�һ���쳣��������Ȼ�������ر�catch����catch�����׳�һ��
	 * 		�쳣���ڷ������÷��ֻᲶ׽һ�Σ����Ի��ӡ��ʾ���
	 */
	
	public static void main(String[] args) {
		try {
			demoproc();
		} catch (NullPointerException e) {
			System.out.println("recaught" + e);
		}
	}
}
