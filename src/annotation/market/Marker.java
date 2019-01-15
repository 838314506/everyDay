package annotation.market;

import java.lang.reflect.Method;

/**
 * 此类用于测试使用标记注解
 */
public class Marker {

	@MyMarker
	public static void myMeth() {
		Marker obj = new Marker();
		try {
			Method method = obj.getClass().getMethod("myMeth");
			//使用此方法可以查看当前方法是否被该注解修饰
			if(method.isAnnotationPresent(MyMarker.class))
				System.out.println("mymarker annotation is present");
		} catch (NoSuchMethodException | SecurityException e) {
			System.out.println("come here indicate exception is happing");
		}
	}
	
	public static void main(String[] args) {
		myMeth();
	}
}
