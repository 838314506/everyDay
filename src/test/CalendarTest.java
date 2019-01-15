package test;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar类最主要的作用就是获得当前时间，同时这个类里面也具有设置时间以及一些其他的功能，
 * 但是由于本身设计的问题，这些方法却遭到众多批评，不建议使用，更推荐使用 Calendar 类进行时间和日期的处理。
 * @author lzz
 *
 */
public class CalendarTest {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		System.out.println("year--->"+year);
		int month = c.get(Calendar.MONTH);//0表示1月份
		System.out.println("month--->"+month);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("day--->"+day);
		
		
		Date date = c.getTime();
		System.out.println("date--->"+date);
		long millis = c.getTimeInMillis();
		System.out.println("millis--->"+millis);
	}

}
