package threadDemo;

public class CurrenThreadDemo {

	public static void main(String[] args) {
		//获取当前主线程，得到它的引用，以此来控制该线程
		Thread thread = Thread.currentThread();

		//current thread :Thread[main,5,main]未修改之前打印的结果
		//[main,5,main]所指的信息是指：线程名称，优先级，线程所属线程组信息
		System.out.println("current thread :" + thread);
		thread.setName("My Thread");
		//after rename :Thread[My Thread,5,main]修改之后打印的结果
		System.out.println("after rename :" + thread);


		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(i);
				//线程睡眠1秒
				thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted");
		}
	}

}
