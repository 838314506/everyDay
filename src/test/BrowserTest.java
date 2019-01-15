package test;

import java.awt.Desktop;
import java.net.URI;
/**
 * 用于测试，按照指定的uri来打开浏览器
 * @author lzz
 *
 */
public class BrowserTest {
	public static void main(String[] args) throws Exception {
		//生成uri地址
		String uri = "www.baidu.com";
		URI ur = new URI(uri);
		//得到桌面上的浏览器
//		Desktop.getDesktop().browse(ur);
		
		int a = 0b1010;
		System.out.println(a);
	}
}
