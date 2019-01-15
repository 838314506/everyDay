package lambdaDemo;

public class MethodRefDemo {
	
	public static String stringOp(StringFunc st,String s) {
		return st.func(s);
	}
	
	public static void main(String[] args) {
		String inStr = "lambda add power to java";
		//֮���Կ�����ô��������ΪstrReverse��ӿ��еķ�������
		String outStr = stringOp(MyStringOps::strReverse,inStr);
		
		System.out.println(outStr);
		
	}

}
