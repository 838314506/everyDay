package test;

public final class MyUtil {
	//用于计算十进制转换为十六进制
	public static String toSixtheen(int num) {
		StringBuffer sb = new StringBuffer();
		while(num != 0) {
			int mod = num % 16;
			if(mod < 10) {
				sb.append(mod);
			}else {
				sb.append(mod - 10 + 'a');
			}
			num /= 16;
		}
		sb.reverse();
		return sb.toString();
	}
}
