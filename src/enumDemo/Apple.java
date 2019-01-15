package enumDemo;

public enum Apple {
	Jonathan(10),GoldenDel(9),RedDel(8),Winesap(7),Cortland(6);
	
	private int price;
	
	private Apple(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}
