package threadDemo;

public class DemoJoin {
	public static void main(String[] args) {
		ThreeNewThread one = new ThreeNewThread("one");
		ThreeNewThread two = new ThreeNewThread("two");
		ThreeNewThread three = new ThreeNewThread("three");
		//���ڲ鿴��ǰ�߳��Ƿ���Ȼ������
		System.out.println("one thread isAlive:"+one.t.isAlive());
		System.out.println("two thread isAlive:"+two.t.isAlive());
		System.out.println("three thread isAlive:"+three.t.isAlive());
		
		try {
			//�ȴ���ǰ�߳��������
			one.t.join();
			two.t.join();
			three.t.join();
		} catch (InterruptedException e) {
			System.out.println("main interrupted");
		}
		System.out.println("main exiting");
		
		System.out.println("one thread isAlive:"+one.t.isAlive());
		System.out.println("two thread isAlive:"+two.t.isAlive());
		System.out.println("three thread isAlive:"+three.t.isAlive());
	}
}
