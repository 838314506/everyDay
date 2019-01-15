package test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 用于测试泛型的类
 * @author lzz
 *
 */
public class Generacia {

	public static void main(String[] args) throws Exception {
//		List<String> num1 = new ArrayList<>();
//		List<Integer> num2 = new ArrayList<>();
		//此处输出结果为true，因为在这里边存在一个类型擦除的现象，在编译的时候直接编译为List.class
//		System.out.println(num1.getClass() == num2.getClass());
		
//		List<String> ls = new ArrayList<>();
//		ls.add("hello");
		
//		Method method = ls.getClass().getDeclaredMethod("add", Object.class);
//		method.invoke(ls, 1);
//		System.out.println(ls);
		
		//测试泛型转译
		Euare<String> es = new Euare<>("hello");
		System.out.println(es.getClass().getName());//输出结果为test.Euare
		Field[] fields = es.getClass().getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType().getName());//输出结果为Object
			//将类的泛型进行修改后输出结果为string
		}
		//结论：在直接进行打印类的类型时为euare，在对其中包含字段进行打印后，如果未声明类关系
		//      那么打印结果为object；如果声明了类的关系，则打印结果为具体的类型
	}
}
//定义单个类型的泛型类
class Test<T>{
	T t;
	//泛型方法
	//泛型方法与泛型类不相同的是，泛型类的泛型定义在方法返回值的前边
	//如果泛型类的类型的为A，而传递给泛型方法的类型参数可以B，两者不相干，因此为避免混淆，应将两个类型
	//设置为不同的类型
	public <T> void testMethod(T t) {}
	public void testWildCards(Collection<T> collection) {
		//此处因为在参数中对于集合中所放入的元素未进行明确的定义，关注不到具体的类型，因此调用add方法报错
		//因此只能进行一些与类型无关的操作，比如迭代
		//解决方法：可以将？通配符改为T
		collection.add((T)"hello");
	}
	public void testWildCard(Collection<? extends Base> collection) {
		//仍然不能通过编译
//		collection.add(new Sub());
//		collection.add(new Base());
	}
	//使用extends不能通过编译，而使用super则能通过编译
	public void testWild(Collection<? super Base> collection) {
		//仍然不能通过编译
		collection.add(new Sub());
		collection.add(new Base());
	}
}
//定义多个类型的泛型类
class Test2<E,T>{
	E value;
	T value2;
}

class Sub extends Base{}
class Base {}

class Euare<T extends String>{
	private T t;
	public Euare(T t) {
		this.t = t;
	}
}
