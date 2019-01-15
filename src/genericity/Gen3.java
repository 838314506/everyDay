package genericity;

public class Gen3 extends Gen<String>{

	Gen3(String o) {
		super(o);
	}

	@Override
	String getOb() {
		System.out.println("you call String getOb()");
		return super.getOb();
	}

	
}
