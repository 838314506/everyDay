package abstractTest;

public abstract class A {
	
	public abstract void callme();
	
	public void callMeToo() {
		System.out.println("this is coreate method!");
	}
	
	public final void testFinal() {
		System.out.println("final method");
	}
	
	public static void main(String[] args) {
//		B b = new B();
//		b.callme();
//		b.callMeToo();
//		int a = a(19,20);//使用内联相当于将a(19,20)直接写成a = x > y? x : y;
		
		String string = String.valueOf(5.8);
		System.out.println(string);
	}
	
	public final static int a(int x,int y) {
		if (x > y) return x;
		else return y;
	}

}

class B extends A{
	

	@Override
	public void callme() {
		System.out.println("i implements callme!");
	}
	
}
