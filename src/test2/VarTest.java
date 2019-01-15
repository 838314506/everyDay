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
	
	//变长参数其实是隐示的数组，并且变长参数必须放在参数的最后一个位置，如下一个方法
	public static void vaTest(int ... v) {
		System.out.println("the v length is :"+v.length);
		for(int x : v) {
			System.out.print(x + "  ");
		}
	}
	//在使用变长参数时，变长参数必须 作为参数列表的最后一个参数，在前几个参数匹配完之后才能匹配变长参数
	//第二个需要注意的方面，参数列表中的变长参数只能有一个
	public static void vaTest(int a,double b,int ... v) {
		System.out.println("first var is :"+a);
		System.out.println("second var is :"+b);
		System.out.println(Arrays.toString(v));
	}
}
