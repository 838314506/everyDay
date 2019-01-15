package test.singleton;

public final class SingletonTest {
	
	
	public static void main(String[] args) {
		Demo demo1 = Demo.get();
		Demo demo2 = Demo.get();
		System.out.println(demo1 == demo2);
		
		Demo2 demo21 = Demo2.get();
		Demo2 demo22 = Demo2.get();
		System.out.println(demo21 == demo22);
	}

}
/**
 * ����ʽ������
 * �ص㣺
 * 		1��˽�й�����
 * 		2�����о�̬����������ʵ����
 * 		      ���ж�ʵ���Ƿ�Ϊ�գ����Ϊ�մ����µĶ��������Ϊ����ֱ�ӷ��ض���
 * 		3����ʼ��Ϊnull
 * @author lzz
 *
 */
	class Demo{
		private static Demo instance = null;
		
		private Demo() {}
		
		public static Demo get() {
			if(instance == null) {
				instance = new Demo();
			}
			return instance;
		}
		
	}
	
/**
 * ����ʽ������
 * �ص㣺
 * 		1��˽�й�����
 * 		2�����о�̬����ֱ�ӷ��ض���ʵ��
 * 		3����ʼ���͸�����
 */
	class Demo2{
		private static Demo2 instance = new Demo2();
		
		private Demo2() {}
		
		public static Demo2 get() {
			return instance;
		}
		
	}
	
	/**
	 * ����ʽ�����ʽ������
	 * 		1������ʽ��ʼ��Ϊnull������ʽ��ʼ��Ϊ��ʵ����
	 * 		2������ʽ���о�̬���������жϺ����ΪNull�ŷ���ʵ��
	 * 			������ʽ�з�����ֱ�ӷ����ֶΡ�
	 * 		3������ʽ�������̲߳���ȫ��������ʽ�������̰߳�ȫ����Ϊ����ʽ����Ϊ��̬�ֶΣ��������
	 * 			������Ĺ����о�Ϊ��̬�����������ڴ棻������ʽ��������ִ�з���ʱ�����ж�ʱ�����������һ���߳�
	 * 			ռ����cpu����ô����ְ�ȫ���⣬����ͨ���ڷ���ǰ����synchronized�������Ч�ʻή��
	 * 		4������ʽ������Ч�ʱ�����ʽ������Ч�ʸ�
	 * 
	 * 
	 */
