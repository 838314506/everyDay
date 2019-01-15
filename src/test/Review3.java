package test;

import java.lang.reflect.Method;

public class Review3 {
	/**
	 * 写一个程序，这个程序能够根据用户提供的类名，去执行该类中的main方法
	 * @throws ClassNotFoundException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String[] args) throws Exception {
//		String name = args[0];
		Method method = Class.forName("test.A").getMethod("main", String[].class);
		method.invoke(null, (Object)new String[] {"111"});
		
	}
	
	
}
class A{
	public static void main(String[] args) {
		for(String arg : args) {
			System.out.println(arg);
		}
	}
}