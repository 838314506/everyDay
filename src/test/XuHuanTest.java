package test;
//用于测试循环中的break和continue
public class XuHuanTest {
	public static void main(String[] args) {
		//使用break是中断本层循环，直接进入下一层循环（如果j=3时break,那么j>3以后的循环不会再做）
		//使用break是中断本次循环，直接进入下一次循环（如果j=3时continue，那么j>3以后的循环不会以再做）
		for(int i = 0;i < 10;i++) {
			System.out.println("i = "+i);
			for(int j = 0;j < 10;j++) {
				System.out.println(j);
				if(j == 3) {
					continue;
				}
			}
		}
		
		//赋值链将相同的值赋予三个变量
		int a,b,c;
		a = b = c = 100;
		
	}
}
