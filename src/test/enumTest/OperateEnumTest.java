package test.enumTest;

public enum OperateEnumTest implements Operate {
	/**
	 * ��һ��ö����ʵ��ĳһ�ӿ�ʱ����ôÿһ��ö���඼����ʵ��������󷽷�
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
	//˽�й�����
	private OperateEnumTest() {
		
	}
	
	public static void main(String[] args) {
		Operate operate = OperateEnumTest.ADD;
		int result = operate.operate(5, 10);
		System.out.println(result);
	}
}
