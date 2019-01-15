package test2;

//Ê¹ÓÃµÝ¹é
public class Factorial {
	
	public static void main(String[] args) {
//		int result = calculator(4);
//		System.out.println(result);
		A a = new A();
		A a2 = new A();
	}

	//µÝ¹é¼ÆËã½×³Ë
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