package test;

import java.lang.reflect.Method;

public class Review3 {
	/**
	 * дһ��������������ܹ������û��ṩ��������ȥִ�и����е�main����
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