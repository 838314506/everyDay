package test;

/**
 * �������ڲ��Ա����ڽ���һЩ�ı����ڴ��ַ
 * @author lzz
 *
 */
public class VarMemory {

	public static void main(String[] args) {
		int a = 11;
		int b = 11;
		testInt(b);
		//��ʱ��ӡ���Ϊfalse���ڷ����б���ָ���ַ�Ѿ������ı�
		System.out.println(b == a);
//		int c = 11;
		//��ʱb��cָ����ڴ��е�ͬһλ��
//		System.out.println(b == c);
		
//		Integer one = 127;
//		one = testInt(one);
//		Integer two = 127;
		//���ڻ������͵����ݣ��ڳ������д��ڲ��ֳ���ֵ����Χ��һ��short�ķ�Χ
//		System.out.println(one == two);
		
		//����������Ĳ����У����þ�̬���������е��ַ���ֻ����˲��ָ����һ��'test'��
		//��������ַ����ڽ��бȽ�ʱ�����Ϊtrue
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
