package lambdaDemo;

public class TestCalculate {
	
	public static void main(String[] args) {
		CalculateInterface demo = (x,y) -> x * y;
		System.out.println(demo.calculate(5, 6));
	}

}
