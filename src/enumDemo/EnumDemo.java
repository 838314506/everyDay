package enumDemo;

public class EnumDemo {
	public static void main(String[] args) {
		Apple ap;
		ap = Apple.RedDel;
		
		System.out.println("value of ap:"+ap);
		
		ap = Apple.GoldenDel;
		
		//枚举也可以进行比较
		if(ap == Apple.GoldenDel)
			System.out.println("ap contains goldendel");
		
//		Apple[] apples = Apple.values();高级代码如下
		for(Apple apple : Apple.values()) {
			System.out.println("the "+apple+" price is "+apple.getPrice());
		}
		
		switch (ap) {
		case RedDel:
			System.out.println("redDel");
			break;
		case Jonathan:
			System.out.println("jonathan");
			break;
		case GoldenDel:
			System.out.println("apple is yellow");
			break;
		case Winesap:
			System.out.println("winesap is red");
			break;
		case Cortland:
			System.out.println("cortland is red");
			break;
		}
	}
}
