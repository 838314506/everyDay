package enumDemo;

public class EnumDemo4 {
	public static void main(String[] args) {
		Apple ap,ap2,ap3;
		
		for(Apple apple : Apple.values()) {
			//���ÿ��ö�����ڵ�λ��ֵ
			System.out.println(apple + "  " + apple.ordinal());
		}
		System.out.println("======================");
		ap = Apple.RedDel;
		ap2 = Apple.GoldenDel;
		ap3 = Apple.RedDel;
		
		if(ap.compareTo(ap2) < 0) {
			System.out.println(ap + "comes before" + ap2);
		}
		
		//�ڽ��бȽ�ʱ���ǰ���ö������λ�ý��бȽϣ���ǰ���λ��ֵС
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
