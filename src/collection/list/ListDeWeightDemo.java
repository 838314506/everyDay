package collection.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDeWeightDemo {
	
	//对于基本类型数据的集合进行去重
//	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		
//		list.add("one");
//		list.add("one");
//		list.add("two");
//		list.add("three");
//		
//		//对于包含基本类型数据的list集合，去重可以将集合放入set中进行
//		Set<String> set = new HashSet<>(list);
//		
//		for (String string : set) {
//			System.out.println(string);
//		}
//		
//		
//	}
	
	//对于引用类型的数据类型，在使用时应该在实体对象中重写equals和hashCode方法，再放入set集合中进行去重
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		
		users.add(new User("tom",18));
		users.add(new User("tom",18));
		users.add(new User("jerry",19));
		users.add(new User("rose",18));
		users.add(new User("jack",18));
		
		for(User user : new HashSet<>(users)) {
			System.out.println(user);
		}
	}

}
