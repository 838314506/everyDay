package stack;

public class StackTest {

	public static void main(String[] args) {
		//ʹ�����ַ�ʽ������stack�е����飬���stack������𺦣����ߴ���ʹ��stack��
		//����ֲ���һ���⣬����»ط���
//		Stack myStack1 = new Stack(5);
//		Stack myStack2 = new Stack(8);
//		
//		for(int i = 0;i < 5;i ++) myStack1.push(i);
//		for(int i = 10;i < 18;i ++) myStack2.push(i);
//		
//		for(int i = 0;i < 5;i ++) {
//			System.out.print(myStack1.pop() + "  ");
//		}
//		System.out.println();
//		
//		for(int i = 0;i < 8;i ++) {
//			System.out.print(myStack2.pop() + "  ");
//		}
		
		for(int i = 0;i < args.length - 1;i++) {
			System.out.print(args[i]);
		}
	}
}
