package sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = new int[] { 9, 5, 1, 4, 8, 6, 7, 2, 3 ,18,55,10,9,66,800,-2,33,44};
		long start = System.currentTimeMillis();
		System.out.println("排序前的顺序......");
		System.out.println(Arrays.toString(a));
//		quickSort(a);
//		bubbleSort(a);
		chooseSort(a);
		System.out.println("排序后的顺序......");
		System.out.println(Arrays.toString(a));
		long end = System.currentTimeMillis();
		System.out.println("使用快速排序耗时："+(end - start));
	}
	
	//1、冒泡排序法,每次遍历相邻的两个元素，进行大小的比较后交换位置
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
	
	//2、选择排序法，判断之后交换下标，将最后的结果进行交换
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
	//3、使用快速排序来实现排序,耗时为0？
	public static void quickSort(int[] a, int start, int end) {
		// 1、当前方法需要递归执行，因此要提出退出递归的条件
		if (start > end)
			return;
		// 2、将下标值赋予i和j
		int i = start, j = end;
		// 3、定义一个key值
		int key = a[start];
		// 4、进行第一次的循环
		while (i < j) {
			//4.1、从右往左找到大于key的值
			while (i < j && a[j] > key) {
				j--;
			}
			//4.2、从左往右找到小于key的值
			while (i < j && a[i] <= key)
				i++;
			//4.3、当key为中间值时，交换i和j的值
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
