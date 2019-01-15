package test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ���ڲ��Է��͵���
 * @author lzz
 *
 */
public class Generacia {

	public static void main(String[] args) throws Exception {
//		List<String> num1 = new ArrayList<>();
//		List<Integer> num2 = new ArrayList<>();
		//�˴�������Ϊtrue����Ϊ������ߴ���һ�����Ͳ����������ڱ����ʱ��ֱ�ӱ���ΪList.class
//		System.out.println(num1.getClass() == num2.getClass());
		
//		List<String> ls = new ArrayList<>();
//		ls.add("hello");
		
//		Method method = ls.getClass().getDeclaredMethod("add", Object.class);
//		method.invoke(ls, 1);
//		System.out.println(ls);
		
		//���Է���ת��
		Euare<String> es = new Euare<>("hello");
		System.out.println(es.getClass().getName());//������Ϊtest.Euare
		Field[] fields = es.getClass().getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType().getName());//������ΪObject
			//����ķ��ͽ����޸ĺ�������Ϊstring
		}
		//���ۣ���ֱ�ӽ��д�ӡ�������ʱΪeuare���ڶ����а����ֶν��д�ӡ�����δ�������ϵ
		//      ��ô��ӡ���Ϊobject�������������Ĺ�ϵ�����ӡ���Ϊ���������
	}
}
//���嵥�����͵ķ�����
class Test<T>{
	T t;
	//���ͷ���
	//���ͷ����뷺���಻��ͬ���ǣ�������ķ��Ͷ����ڷ�������ֵ��ǰ��
	//�������������͵�ΪA�������ݸ����ͷ��������Ͳ�������B�����߲���ɣ����Ϊ���������Ӧ����������
	//����Ϊ��ͬ������
	public <T> void testMethod(T t) {}
	public void testWildCards(Collection<T> collection) {
		//�˴���Ϊ�ڲ����ж��ڼ������������Ԫ��δ������ȷ�Ķ��壬��ע������������ͣ���˵���add��������
		//���ֻ�ܽ���һЩ�������޹صĲ������������
		//������������Խ���ͨ�����ΪT
		collection.add((T)"hello");
	}
	public void testWildCard(Collection<? extends Base> collection) {
		//��Ȼ����ͨ������
//		collection.add(new Sub());
//		collection.add(new Base());
	}
	//ʹ��extends����ͨ�����룬��ʹ��super����ͨ������
	public void testWild(Collection<? super Base> collection) {
		//��Ȼ����ͨ������
		collection.add(new Sub());
		collection.add(new Base());
	}
}
//���������͵ķ�����
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
