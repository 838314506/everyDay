package annotation;

import java.lang.reflect.Method;

public class Meta {
	
	//在此如果注解的保留策略不是RUNTIME的话，那么使用反射是得到的注解为Null
	//那么在下边使用注解的方法时会报一个空指针异常
	@MyAnno(str = "Annotation example",val = 100)
	public static void myMeth(String name,int age) {
		Meta ob = new Meta();
		
		Class<? extends Meta> clazz = ob.getClass();
		
		try {
			Method method = clazz.getMethod("myMeth",String.class,int.class);
			
			MyAnno anno = method.getAnnotation(MyAnno.class);
			System.out.println(anno.val());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {
		myMeth("tom",18);
	}
}
