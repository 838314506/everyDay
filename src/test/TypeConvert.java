package test;

public class TypeConvert {
	public static void main(String[] args) {
		//������ǿת������߲���ֵ��Χ�����˵Ͳ���ֵ��Χ����ô�������������Ӧֵ�ĸ������byte
		//��Χ�����������
		int a = 200;
		byte b;
		b = (byte)a;
		System.out.println(b);
		
		//����ʹ��ʱ������Ὣ���������Զ�����Ϊint��˻ᱨ������ ����ǿת
		byte c = 50;
		c = (byte) (c * 2);
		System.out.println(c);
	}
}
