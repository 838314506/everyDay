package test;

import java.util.ArrayList;
import java.util.List;

public class Review {
	
	public static void main(String[] args) {
		/**
		 * ʹ�ü�������Ĺ��ߣ��м���ʹ�����Ҫ�ر���Դ
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�������1������:");
		int first = scan.nextInt();
		System.out.println("�������2������:");
		int middle = scan.nextInt();
		System.out.println("�������3������:");
		int last = scan.nextInt();
		System.out.println("�������ֵĻ�Ϊ��"+first*middle*last);
		scan.close();
		 */
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�������1������:");
//		int one = scan.nextInt();
//		System.out.println("�������2������:");
//		int two = scan.nextInt();
//		System.out.println("�������3������:");
//		int three = scan.nextInt();
//		
//		if( one > two ) {
//			int temp = one;
//			one = two;
//			two = temp;
//		}
//		if( two > three ) {
//			int temp = two;
//			two = three;
//			three = temp;
//		}
//		if( one > three ) {
//			int temp = one;
//			one = three;
//			three = temp;
//		}
//		
//		System.out.println(one + "<=" + two +"<=" +three);
//		scan.close();
		
		
		/**
		 * �������ַ���ת������
		
		String binary = Integer.toBinaryString(6);
		System.out.println(binary);
		String hex = Integer.toHexString(65);
		System.out.println(hex);
		*/
		
		/**
		 * ����switch��֧���
		 
		int day = 4;
		switch (day) {
			case 1:
			System.out.println("��������һ��");
			break;
			case 2:
				System.out.println("�������ڶ���");
				break;
			case 3:
				System.out.println("������������");
				break;
			case 4:
				System.out.println("���������ģ�");
				break;
			case 5:
				System.out.println("���������壡");
				break;
			case 6:
				System.out.println("������������");
				break;
			case 7:
				System.out.println("���������죡");
				break;
			default:
				System.out.println("����ʱ������");
				break;
		}
		*/
//		System.out.println("main1");
//		String result = MyUtil.toSixtheen(256);
//		System.out.println(result);
		
		//��Ǯ��ټ�
		//һ��Ǯ������һ�ټ���x������Ǯ��yĸ����Ǯ��zС��һǮ�������ʹ�����ĸ����С�������٣�
//		for(int x = 1;x < 20;x++) {
//			for(int y = 1;y < 33;y++) {
//				for(int z = 3;z < 100;z+=3) {
//					if( x+y+z == 100 && 5*x + 3*y + z/3 ==100) {
//						System.out.printf("%4s%4s%4s\n",x,y,z);
//					}
//				}
//			}
//		}
		int a = 42;
		int b = 15;
		System.out.println(a & b);
	}
}
