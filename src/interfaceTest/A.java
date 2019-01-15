package interfaceTest;

public class A {

	public interface NestedIF{
		boolean isNoNegative(int x);
	}
	
	public static void main(String[] args) {
		A.NestedIF nif = new B();
		if(nif.isNoNegative(10)) 
			System.out.println("10 is not negative");
		if(nif.isNoNegative(-12))
			System.out.println("this wont be displayed");
	}
}

class B implements A.NestedIF{

	@Override
	public boolean isNoNegative(int x) {
		return x < 0 ? false : true;
	}
	
}