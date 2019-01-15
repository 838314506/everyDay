package threadDemo.notifyDemo;

public class PC {
	
	public static void main(String[] args) {
		Q q = new Q();
		new Procuder(q);
		new Consumer(q);
		
		System.out.println("press ctrl+c to stop");
	}

}
