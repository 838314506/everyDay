package test;

import java.util.HashMap;
import java.util.Map;


public class HashMapTest {
	
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		
		int h = 15 ;
		int length = 16;
		System.out.println(h & (length-1));
		h = 15+16;
		System.out.println(h & (length-1));
		h = 15+16;
		System.out.println(h & (length-1));
	}

}
