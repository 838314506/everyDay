package test2;

public class ChainExcDemo {
	
	public static void demoproc() {
		NullPointerException exception = new NullPointerException();
		//�˷�������Ϊ�쳣��������ǰ�쳣���쳣
		exception.initCause(new ArithmeticException());
		throw exception;
	}
	
	public static void main(String[] args) {
		try {
			demoproc();
		} catch (Exception e) {
			//getCause()���Եõ�����ǰ�쳣���쳣
			System.out.println("the cause exception is :"+e.getCause());
			System.out.println("catch exception is :"+e);
		}
	}

}
