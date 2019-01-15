package test2;

public class BreakAndContinueTest {

	public static void main(String[] args) {
		// boolean edition = true;
		// first: {
		// second: {
		// three: {
		// if (edition)
		// //用于跳出某一个标签位置的代码块
		// break second;
		// System.out.println("three");
		// }
		// System.out.println("second");
		// }
		// System.out.println("first");
		// }
		outer: for (int i = 0; i < 3; i++) {
			System.out.println("pass " + i + ": ");
			for (int j = 0; j < 30; j++) {
				if (j == 10) break outer;
				System.out.print(j + " ");
			}
			System.out.println("this will not print");
		}
		System.out.println("end loop");
	}

}
