package test.enumTest;

public enum OperateEnumTest implements Operate {
	/**
	 * 当一个枚举类实现某一接口时，那么每一个枚举类都必须实现这个抽象方法
	 */
	ADD {
		public int operate(int a, int b) {
			return a + b;
		}
	},
	SUBTRACT {
		public int operate(int a, int b) {
			return a - b;
		}
	},
	MULTIPLY {
		public int operate(int a, int b) {
			return a * b;
		}
	},
	DEVIDE {
		public int operate(int a, int b) {
			return a / b;
		}
	};
	//私有构造器
	private OperateEnumTest() {
		
	}
	
	public static void main(String[] args) {
		Operate operate = OperateEnumTest.ADD;
		int result = operate.operate(5, 10);
		System.out.println(result);
	}
}
