package annotation;

import java.lang.reflect.Method;

public class Meta {
	
	//�ڴ����ע��ı������Բ���RUNTIME�Ļ�����ôʹ�÷����ǵõ���ע��ΪNull
	//��ô���±�ʹ��ע��ķ���ʱ�ᱨһ����ָ���쳣
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
