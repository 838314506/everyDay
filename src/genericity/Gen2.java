package genericity;

public class Gen2<T> extends Gen<T> {
	
	T ob;

	Gen2(T o) {
		super(o);
		ob = o;
	}

	@Override
	public void showType() {
		System.out.println("gen2 " + ob.getClass().getName() + " type");
	}
	
	public static void main(String[] args) {
		Gen<Integer> iob = new Gen<Integer>(99);
		Gen2<Integer> iob2 = new Gen2<Integer>(88);
		Gen2<String> sob2 = new Gen2<String>("test string");
		
		iob.showType();
		iob2.showType();
		sob2.showType();
	}

}
