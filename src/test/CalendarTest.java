package test;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar������Ҫ�����þ��ǻ�õ�ǰʱ�䣬ͬʱ���������Ҳ��������ʱ���Լ�һЩ�����Ĺ��ܣ�
 * �������ڱ�����Ƶ����⣬��Щ����ȴ�⵽�ڶ�������������ʹ�ã����Ƽ�ʹ�� Calendar �����ʱ������ڵĴ���
 * @author lzz
 *
 */
public class CalendarTest {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		System.out.println("year--->"+year);
		int month = c.get(Calendar.MONTH);//0��ʾ1�·�
		System.out.println("month--->"+month);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("day--->"+day);
		
		
		Date date = c.getTime();
		System.out.println("date--->"+date);
		long millis = c.getTimeInMillis();
		System.out.println("millis--->"+millis);
	}

}
