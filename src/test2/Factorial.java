package test2;

//ʹ�õݹ�
public class Factorial {
	
	public static void main(String[] args) {
//		int result = calculator(4);
//		System.out.println(result);
		A a = new A();
		A a2 = new A();
	}

	//�ݹ����׳�
	public static int calculator(int i) {
		if(i == 1) {
			return 1;
		} else {
			return calculator(i - 1) * i;
		}
	}
}

class A{
	static {
		System.out.println("static block");
	}
	{
		System.out.println("no name block");
	}
}