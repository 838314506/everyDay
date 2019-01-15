package enumDemo;

public class EnumDemo4 {
	public static void main(String[] args) {
		Apple ap,ap2,ap3;
		
		for(Apple apple : Apple.values()) {
			//输出每个枚举所在的位置值
			System.out.println(apple + "  " + apple.ordinal());
		}
		System.out.println("======================");
		ap = Apple.RedDel;
		ap2 = Apple.GoldenDel;
		ap3 = Apple.RedDel;
		
		if(ap.compareTo(ap2) < 0) {
			System.out.println(ap + "comes before" + ap2);
		}
		
		//在进行比较时，是按照枚举所在位置进行比较，在前面的位置值小
		if(ap.compareTo(ap2) > 0) {
			System.out.println(ap2 + "comes before" + ap);
		}
		
		if(ap.compareTo(ap3) == 0) {
			System.out.println(ap + "equals " + ap3);
		}
		
		System.out.println();
		
		if(ap.equals(ap2)) {
			System.out.println("error");
		}
		
		if(ap.equals(ap3)) {
			System.out.println(ap + " equals " + ap3);
		}
		
		if(ap == ap3) {
			System.out.println(ap + " == " + ap3);
		}
	}
}
