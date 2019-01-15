package sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = new int[] { 9, 5, 1, 4, 8, 6, 7, 2, 3 ,18,55,10,9,66,800,-2,33,44};
		long start = System.currentTimeMillis();
		System.out.println("����ǰ��˳��......");
		System.out.println(Arrays.toString(a));
//		quickSort(a);
//		bubbleSort(a);
		chooseSort(a);
		System.out.println("������˳��......");
		System.out.println(Arrays.toString(a));
		long end = System.currentTimeMillis();
		System.out.println("ʹ�ÿ��������ʱ��"+(end - start));
	}
	
	//1��ð������,ÿ�α������ڵ�����Ԫ�أ����д�С�ıȽϺ󽻻�λ��
	public static void bubbleSort(int[] a) {
		if(a.length == 1 || a.length == 0) {
			return;
		}
		for(int i = 0;i < a.length - 1;i ++) {
			for(int j = 0;j < a.length - 1 - i;j ++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	//2��ѡ�����򷨣��ж�֮�󽻻��±꣬�����Ľ�����н���
	public static void chooseSort(int[] a) {
		if(a.length == 1 || a.length == 0) {
			return;
		}
		for(int i = 0;i < a.length - 1;i ++) {
			int k = i;
			for(int j = i + 1;j < a.length;j ++) {
				if(a[j] < a[k]) {
					k = j;
				}
			}
			int temp = a[k];
			a[k] = a[i];
			a[i] = temp;
		}
		
	}

	public static void quickSort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}
	//3��ʹ�ÿ���������ʵ������,��ʱΪ0��
	public static void quickSort(int[] a, int start, int end) {
		// 1����ǰ������Ҫ�ݹ�ִ�У����Ҫ����˳��ݹ������
		if (start > end)
			return;
		// 2�����±�ֵ����i��j
		int i = start, j = end;
		// 3������һ��keyֵ
		int key = a[start];
		// 4�����е�һ�ε�ѭ��
		while (i < j) {
			//4.1�����������ҵ�����key��ֵ
			while (i < j && a[j] > key) {
				j--;
			}
			//4.2�����������ҵ�С��key��ֵ
			while (i < j && a[i] <= key)
				i++;
			//4.3����keyΪ�м�ֵʱ������i��j��ֵ
			if (i < j) {
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;

			}
		}
		int temp = a[i];
		a[i] = a[start];
		a[start] = temp;

		quickSort(a, start, i - 1);
		quickSort(a, i + 1, end);
	}
}
