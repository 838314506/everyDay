package annotation.market;

import java.lang.reflect.Method;

/**
 * �������ڲ���ʹ�ñ��ע��
 */
public class Marker {

	@MyMarker
	public static void myMeth() {
		Marker obj = new Marker();
		try {
			Method method = obj.getClass().getMethod("myMeth");
			//ʹ�ô˷������Բ鿴��ǰ�����Ƿ񱻸�ע������
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
