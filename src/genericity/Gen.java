package genericity;

public class Gen<T> {

	T ob;
	
	Gen(T o){
		ob = o;
	}
	
	T getOb() {
		return ob;
	}
	
	public void showType() {
		System.out.println("gen " + ob.getClass().getName() + " type ");
	}
}
