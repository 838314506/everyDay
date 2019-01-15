package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "this is meta2")
@MyAnno(str = "myanno",val = 19)
public class Meta2 {

	@What(description = "an annotation test method")
	@MyAnno(str = "method myanno",val = 199)
	public static void myMeth() {
		Meta2 obj = new Meta2();
		
		Annotation[] annos = obj.getClass().getAnnotations();
		
		for(Annotation anno : annos) {
			System.out.println(anno);
		}
		
		try {
			Method method = obj.getClass().getMethod("myMeth");
			
			annos = method.getAnnotations();
			
			for(Annotation a : annos)
				System.out.println(a);
		} catch (NoSuchMethodException | SecurityException e) {
			System.out.println("come here indicate exception is happing");
		}
	}
	
	public static void main(String[] args) {
		myMeth();
	}
}
