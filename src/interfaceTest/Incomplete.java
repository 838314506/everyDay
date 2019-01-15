package interfaceTest;

//实现某一接口时，不实现它的方法，那么这个类必须 声明为abstract
public abstract class Incomplete implements Callback{

	public void show() {
		System.out.println("this is imcomplete!");
	}
}
