package test2;

import java.util.Arrays;

public class VarTest {
	
	public static void main(String[] args) {
		
		vaTest(1);
		System.out.println();
		vaTest(2,8,10);
		System.out.println();
		vaTest(8, 1.0, 2,9,6);
		
	}
	
	//�䳤������ʵ����ʾ�����飬���ұ䳤����������ڲ��������һ��λ�ã�����һ������
	public static void vaTest(int ... v) {
		System.out.println("the v length is :"+v.length);
		for(int x : v) {
			System.out.print(x + "  ");
		}
	}
	//��ʹ�ñ䳤����ʱ���䳤�������� ��Ϊ�����б�����һ����������ǰ��������ƥ����֮�����ƥ��䳤����
	//�ڶ�����Ҫע��ķ��棬�����б��еı䳤����ֻ����һ��
	public static void vaTest(int a,double b,int ... v) {
		System.out.println("first var is :"+a);
		System.out.println("second var is :"+b);
		System.out.println(Arrays.toString(v));
	}
}
