package test;

/**
 * �������ڲ���������Ĳ���
 * @author lzz
 *
 */
public class OperatorTest {
	public static void main(String[] args) {
//		byte a = 64,b;
//		int i;
		//�ڴ�����Ϊ�˽�����ֵ��a������Ϊint���ͣ����64�������ٴΣ�0100 000��ʹi����ֵ
		//256��10000 0000������bΪ0����Ϊ��λ֮�����ڵ��ֽ�Ϊ0��ֻ��һλ���Ƴ���
		//��Ϊÿ�������൱�ڽ�ԭʼֵ����2���������˾�������������������2������ҪС�ģ���� 
		//��������1�ƽ��߽�λ����31λ���63λ����������ɸ���
//		i = a << 2;
//		b = (byte) (a << 2);
//		
//		System.out.println("original a = " + a);
//		System.out.println("i and b " + i + " " + b);
		
		//<<���ƣ�����������λ
		//>>���ƣ���������λ   ������ʱ�����Զ������λ����ֵ���б������������λ���Ƴ�
		//>>>�޷���λ���ƣ�
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
