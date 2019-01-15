package test;

/**
 * 此类用于测试运算符的操作
 * @author lzz
 *
 */
public class OperatorTest {
	public static void main(String[] args) {
//		byte a = 64,b;
//		int i;
		//在此由于为了进行求值，a被提升为int类型，因此64被左移再次（0100 000）使i包含值
		//256（10000 0000）但是b为0，因为移位之后，现在低字节为0。只有一位被移出了
		//因为每次左移相当于将原始值乘以2，所以有人经常用这个方法替代乘以2。但是要小心，如果 
		//将二进制1移进高阶位（第31位或第63位），结果会变成负数
//		i = a << 2;
//		b = (byte) (a << 2);
//		
//		System.out.println("original a = " + a);
//		System.out.println("i and b " + i + " " + b);
		
		//<<左移：不保留负号位
		//>>右移：保留负号位   在运算时它会自动将最高位的数值进行保留，将多余的位数移除
		//>>>无符号位右移：
//		
//		int x = 1;
//		int y = 2;
//		int z = 3;
//		
//		x |= 4;//1  100
//		y >>= 1;
//		z <<= 1;
//		x ^= z;//101 110
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		
//		int i,k;
//		i = 10;
//		k = i < 0 ? -i : i;
//		System.out.println("absolute value is:"+i);
//		System.out.println(i + " is "+ k);
//		
//		i = -10;
//		k = i < 0 ? -i : i;
//		System.out.println("absolute value is:"+i);
//		System.out.println(i + " is "+ k);
		
		int month = 4;
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("winter arrive");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("spring arrive");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer arrive");
			break;
		default :
			System.out.println("atum arrive");
			break;
		}
	}
}
