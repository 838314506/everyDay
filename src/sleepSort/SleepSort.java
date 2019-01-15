package sleepSort;

/**
 * 睡眠排序法详解：
 * 	 根据cpu来给当前数字一个休眠时间，在不同的数字休眠长短不同，因此休眠时间短的数字就会占到cpu
 *	 从而提前打印，最终达到一个排序的效果。在这里边数字不能为负数，数字太大可能会导致线程一直睡眠。
 * @author lzz
 *
 */
public class SleepSort implements Runnable{
	
	private int num;
	
	public SleepSort(int num) {
		this.num = num;
	}
	
	public static void main(String[] args) {
		int[] aa = {1,9,8,3,7,5,4,2,6};
		for(int i = 0;i < aa.length;i ++) {
			new Thread(new SleepSort(aa[i])).start();
		}
	}

	@Override
	public void run() {
		try {
			Thread.sleep(num * 10 + 10);
			System.out.println(num);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
