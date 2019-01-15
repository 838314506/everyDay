package annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * java中注解采取了保留策略
 * 1、source策略，使用该策略，将会在编译期间被抛弃
 * 2、class策略，使用此策略，将会运行时被抛弃
 * 3、runtime策略，使用此策略，将会永久的保留此注解
 * @author lzz
 *
 */
@Retention(RetentionPolicy.RUNTIME)
//使用此注解表明该注解可以使用重复注解，先将它声明为容器注解
@Repeatable(MyRepeatedAnnos.class)
public @interface MyAnno {
	String str() default "test";//这样定义时，相当于定义一个域变量，因为赋值时是按照变量赋值的
	int val() default 9000;
}
