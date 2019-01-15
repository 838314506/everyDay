package genericity;

public class GenDemo {

	public static void main(String[] args) {
		Gen<Integer> ob;
		
		ob = new Gen<Integer>(88);
		
		ob.showType();
		
		Integer value = ob.getOb();
		
		System.out.println("the value is " + value);
		
		Gen<String> obs;
		
		obs = new Gen<String>("hello");
		
		obs.showType();
		
		System.out.println("the value is " + obs.getOb());
	}
}
