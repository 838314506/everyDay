package threadDemo.synchronizedDemo;

public class Callme {
	
	//�ڴ˼���synchronized�ؼ��֣����Դﵽͬ����Ч��������һ�ַ��������Caller�е�run����
	public void call(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("child thread interrupted");
		}
		System.out.println("]");
	}

}
