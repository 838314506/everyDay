package annotation;

import java.lang.reflect.Method;

/**
 * 此类用于测试重复注解，容器注解
 * @author lzz
 *
 */
public class RepeatAnno {

	@MyAnno(str = "first annotation",val = 100)
	@MyAnno(str = "second annotation",val = 1000)
	public static void myMeth(String str,int val) {
		RepeatAnno anno = new RepeatAnno();
		
		try {
			Method m = anno.getClass().getMethod("myMeth",String.class,int.class);
			MyRepeatedAnnos annos = m.getAnnotation(MyRepeatedAnnos.class);
			System.out.println(annos);
		} catch (NoSuchMethodException | SecurityException e) {
			System.out.println("come here indicate exception is happing");
		}
	}
	
	public static void main(String[] args) {
		myMeth("test",10);
	}
}
