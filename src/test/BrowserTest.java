package test;

import java.awt.Desktop;
import java.net.URI;
/**
 * ���ڲ��ԣ�����ָ����uri���������
 * @author lzz
 *
 */
public class BrowserTest {
	public static void main(String[] args) throws Exception {
		//����uri��ַ
		String uri = "www.baidu.com";
		URI ur = new URI(uri);
		//�õ������ϵ������
//		Desktop.getDesktop().browse(ur);
		
		int a = 0b1010;
		System.out.println(a);
	}
}
