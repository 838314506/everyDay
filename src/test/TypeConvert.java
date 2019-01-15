package test;

public class TypeConvert {
	public static void main(String[] args) {
		//当进行强转后，如果高层数值范围超过了低层数值范围，那么它将会运算出对应值的负数或对byte
		//范围后的余数减少
		int a = 200;
		byte b;
		b = (byte)a;
		System.out.println(b);
		
		//当在使用时，运算会将数据类型自动提升为int因此会报错，必须 进行强转
		byte c = 50;
		c = (byte) (c * 2);
		System.out.println(c);
	}
}
