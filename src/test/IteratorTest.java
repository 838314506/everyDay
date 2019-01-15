package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 此类用于测试实现Iterable接口以后，可以直接使用迭代的增强for循环
 * @author lzz
 *
 * @param <T>
 */
public class IteratorTest<T> implements Iterable{
	
	private List<T> list = new ArrayList<>();
	
	IteratorTest() {};

	@Override
	public Iterator iterator() {
		return list.iterator();
	}

	public void add(T t) {
		list.add(t);
	}
	
	public static void main(String[] args) {
		List<String> list2 = new ArrayList<>();
		list2.add("hello");
		Iterator<String> iterator = list2.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		IteratorTest<String> test = new IteratorTest<>();
		test.add("hello");
		Iterator it = test.iterator();
		for (Object object : test) {
			System.out.println(it.next());
		}
		
	}
}
