package test;
//���ڲ���ѭ���е�break��continue
public class XuHuanTest {
	public static void main(String[] args) {
		//ʹ��break���жϱ���ѭ����ֱ�ӽ�����һ��ѭ�������j=3ʱbreak,��ôj>3�Ժ��ѭ������������
		//ʹ��break���жϱ���ѭ����ֱ�ӽ�����һ��ѭ�������j=3ʱcontinue����ôj>3�Ժ��ѭ��������������
		for(int i = 0;i < 10;i++) {
			System.out.println("i = "+i);
			for(int j = 0;j < 10;j++) {
				System.out.println(j);
				if(j == 3) {
					continue;
				}
			}
		}
		
		//��ֵ������ͬ��ֵ������������
		int a,b,c;
		a = b = c = 100;
		
	}
}
