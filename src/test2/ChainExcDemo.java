package test2;

public class ChainExcDemo {
	
	public static void demoproc() {
		NullPointerException exception = new NullPointerException();
		//此方法用于为异常设置引起当前异常的异常
		exception.initCause(new ArithmeticException());
		throw exception;
	}
	
	public static void main(String[] args) {
		try {
			demoproc();
		} catch (Exception e) {
			//getCause()可以得到引起当前异常的异常
			System.out.println("the cause exception is :"+e.getCause());
			System.out.println("catch exception is :"+e);
		}
	}

}
