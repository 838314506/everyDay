package allStream.bufferIo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {

	public static void main(String[] args) throws IOException {
		/**
		 * 此对象可以用读取缓冲的输入流，构造函数中Reader对象是抽象类，inputStreamReader是
		 * 它的子类，这个类将字节转为字符。
		 * system.in引用inputstream类型的对象，与控制台建立链接
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter character 'q' to exit!");

		char c;
		do {
			c = (char) br.read();
			System.out.println(c);
		} while (c != 'q');
		br.close();
	}

}
