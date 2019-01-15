package test;

import java.util.ArrayList;
import java.util.List;

public class Review {
	
	public static void main(String[] args) {
		/**
		 * 使用键盘输入的工具，切记在使用完后要关闭资源
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第1个数字:");
		int first = scan.nextInt();
		System.out.println("请输入第2个数字:");
		int middle = scan.nextInt();
		System.out.println("请输入第3个数字:");
		int last = scan.nextInt();
		System.out.println("三个数字的积为："+first*middle*last);
		scan.close();
		 */
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("请输入第1个数字:");
//		int one = scan.nextInt();
//		System.out.println("请输入第2个数字:");
//		int two = scan.nextInt();
//		System.out.println("请输入第3个数字:");
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
		 * 数字型字符串转换进制
		
		String binary = Integer.toBinaryString(6);
		System.out.println(binary);
		String hex = Integer.toHexString(65);
		System.out.println(hex);
		*/
		
		/**
		 * 测试switch分支语句
		 
		int day = 4;
		switch (day) {
			case 1:
			System.out.println("今天星期一！");
			break;
			case 2:
				System.out.println("今天星期二！");
				break;
			case 3:
				System.out.println("今天星期三！");
				break;
			case 4:
				System.out.println("今天星期四！");
				break;
			case 5:
				System.out.println("今天星期五！");
				break;
			case 6:
				System.out.println("今天星期六！");
				break;
			case 7:
				System.out.println("今天星期天！");
				break;
			default:
				System.out.println("输入时间有误！");
				break;
		}
		*/
//		System.out.println("main1");
//		String result = MyUtil.toSixtheen(256);
//		System.out.println(result);
		
		//百钱买百鸡
		//一百钱，能买一百鸡，x公鸡五钱，y母鸡三钱，z小鸡一钱三个，问公鸡、母鸡、小鸡各多少？
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
