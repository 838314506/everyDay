package genericity;

public class GenIfDemo {

	public static void main(String[] args) {
		Integer[] obj = new Integer[] {6,80,3,5,60};
		Character[] obj2 = new Character[] {'b','w','q','0'};
		
		MyClass<Integer> o1 = new MyClass<Integer>(obj);
		MyClass<Character> o2 = new MyClass<Character>(obj2);
		
		System.out.println("the max value of integer is "+o1.max());
		System.out.println("the min value of integer is "+o1.min());
		
		System.out.println();
		
		System.out.println("the max value of String is "+o2.max());
		System.out.println("the min value of String is "+o2.min());
	}
}
