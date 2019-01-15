package gcTest;

public class MyObject {
	
	Test main;
	
	MyObject(Test t) {
		main = t;
	}

	@Override
	protected void finalize() {
		main.ref = this;
		System.out.println("this is finalize");
//		super.finalize();
	}
	
	

}
