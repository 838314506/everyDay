package test.singleton;

public final class SingletonTest {
	
	
	public static void main(String[] args) {
		Demo demo1 = Demo.get();
		Demo demo2 = Demo.get();
		System.out.println(demo1 == demo2);
		
		Demo2 demo21 = Demo2.get();
		Demo2 demo22 = Demo2.get();
		System.out.println(demo21 == demo22);
	}

}
/**
 * 懒汉式单例类
 * 特点：
 * 		1、私有构造器
 * 		2、公有静态方法返回真实对象
 * 		      先判断实例是否为空，如果为空创建新的对象，如果不为空则直接返回对象
 * 		3、初始化为null
 * @author lzz
 *
 */
	class Demo{
		private static Demo instance = null;
		
		private Demo() {}
		
		public static Demo get() {
			if(instance == null) {
				instance = new Demo();
			}
			return instance;
		}
		
	}
	
/**
 * 饿汉式单例类
 * 特点：
 * 		1、私有构造器
 * 		2、公有静态方法直接返回对象实例
 * 		3、初始化就给对象
 */
	class Demo2{
		private static Demo2 instance = new Demo2();
		
		private Demo2() {}
		
		public static Demo2 get() {
			return instance;
		}
		
	}
	
	/**
	 * 懒汉式与饿汉式的区别
	 * 		1、懒汉式初始化为null，饿汉式初始化为真实对象
	 * 		2、懒汉式公有静态方法进行判断后，如果为Null才返回实例
	 * 			而饿汉式有方法中直接返回字段。
	 * 		3、懒汉式单例类线程不安全，而饿汉式单例类线程安全，因为饿汉式单例为静态字段，在虚拟机
	 * 			加载类的过程中就为静态变量分配了内存；而懒汉式单例，在执行方法时进行判断时，如果有另外一个线程
	 * 			占领了cpu，那么会出现安全问题，可以通过在方法前加入synchronized来解决，效率会降低
	 * 		4、饿汉式单例类效率比懒汉式单例类效率高
	 * 
	 * 
	 */
