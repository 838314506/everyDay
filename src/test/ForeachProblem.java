package test;

public class ForeachProblem {
	
	public static void main(String[] args) {
//		int[] aa = new int[] {1,2,3,4,5};
		
		//����ǿ���foreach�б�����ֵ�ǿɶ��ģ���ʹ�ǽ������޸ģ����Ҳ������������ֻ����ʱ�ؽ����޸�
//		for(int a : aa) {
//			System.out.print(a + "  ");
//			a *= 10;
//		}
//		
//		System.out.println();
//		
//		for(int a : aa) {
//			System.out.print(a + "  ");
//		}
		int num = 0;
		
		int[][] aa = new int[3][5];
		
		for(int i = 0;i < 3;i ++) {
			for(int j = 0;j < 5;j ++) {
				aa[i][j] = (i + 1) * (j + 1);
			}
		}
		
		for(int x[] : aa) {
			for(int y : x) {
				System.out.print(y + "  ");
				num += y;
			}
		}
		System.out.println(num);
	}

}
