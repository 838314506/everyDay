package genericity;

import java.util.ArrayList;
import java.util.List;

public class BridgeDemo {
	
	public static void main(String[] args) {
//		Gen2 ob2 = new Gen2("generic test");
		List<String> list = new ArrayList<>();
		Gen<?>[] gen = new Gen<?>[10];
//		System.out.println(ob2.getOb());
	}

}
