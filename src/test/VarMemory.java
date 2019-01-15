package test;

/**
 * 此类用于测试变量在进行一些改变后的内存地址
 * @author lzz
 *
 */
public class VarMemory {

	public static void main(String[] args) {
		int a = 11;
		int b = 11;
		testInt(b);
		//此时打印结果为false，在方法中变量指向地址已经发生改变
		System.out.println(b == a);
//		int c = 11;
		//此时b和c指向堆内存中的同一位置
//		System.out.println(b == c);
		
//		Integer one = 127;
//		one = testInt(one);
//		Integer two = 127;
		//对于基本类型的数据，在常量池中存在部分常量值，范围是一个short的范围
//		System.out.println(one == two);
		
		//在这个方法的测试中，调用静态方法后，其中的字符串只是在瞬间指向了一次'test'，
		//因此两个字符串在进行比较时，结果为true
//		String one = "hello";
//		testString(one);
//		String two = "hello";
//		one = testString(one);
//		System.out.println(one == two);
	}
	
	public static void testInt(Integer x) {
		x = 5;
	}
	public static void testString(String str) {
		str = "test";
	}
}
