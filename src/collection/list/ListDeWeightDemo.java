package collection.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDeWeightDemo {
	
	//���ڻ����������ݵļ��Ͻ���ȥ��
//	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		
//		list.add("one");
//		list.add("one");
//		list.add("two");
//		list.add("three");
//		
//		//���ڰ��������������ݵ�list���ϣ�ȥ�ؿ��Խ����Ϸ���set�н���
//		Set<String> set = new HashSet<>(list);
//		
//		for (String string : set) {
//			System.out.println(string);
//		}
//		
//		
//	}
	
	//�����������͵��������ͣ���ʹ��ʱӦ����ʵ���������дequals��hashCode�������ٷ���set�����н���ȥ��
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
