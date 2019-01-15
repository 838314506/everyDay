package functionInterface;

import java.util.function.Function;

public class UserFunctionInterfaceDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> factorical = (n) -> {
			int result = 1;
			for (int i = 1; i <= n; i++)
				result *= i;
			return result;
		};

		System.out.println(factorical.apply(3));
		System.out.println(factorical.apply(1));
	}

}
