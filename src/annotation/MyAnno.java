package annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * java��ע���ȡ�˱�������
 * 1��source���ԣ�ʹ�øò��ԣ������ڱ����ڼ䱻����
 * 2��class���ԣ�ʹ�ô˲��ԣ���������ʱ������
 * 3��runtime���ԣ�ʹ�ô˲��ԣ��������õı�����ע��
 * @author lzz
 *
 */
@Retention(RetentionPolicy.RUNTIME)
//ʹ�ô�ע�������ע�����ʹ���ظ�ע�⣬�Ƚ�������Ϊ����ע��
@Repeatable(MyRepeatedAnnos.class)
public @interface MyAnno {
	String str() default "test";//��������ʱ���൱�ڶ���һ�����������Ϊ��ֵʱ�ǰ��ձ�����ֵ��
	int val() default 9000;
}
