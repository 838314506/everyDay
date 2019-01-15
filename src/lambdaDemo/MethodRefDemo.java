package lambdaDemo;

public class MethodRefDemo {
	
	public static String stringOp(StringFunc st,String s) {
		return st.func(s);
	}
	
	public static void main(String[] args) {
		String inStr = "lambda add power to java";
		//之所以可以这么做，是因为strReverse与接口中的方法兼容
		String outStr = stringOp(MyStringOps::strReverse,inStr);
		
		System.out.println(outStr);
		
	}

}
