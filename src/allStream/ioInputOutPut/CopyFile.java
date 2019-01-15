package allStream.ioInputOutPut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		int i;
		File file = new File("C:\\Users\\lzz\\Desktop\\b.txt");
		//在try块中声明的引用被隐式地声明为final，因此不能再将其它值赋予该引用
		try (FileInputStream in = new FileInputStream(new File("C:\\Users\\lzz\\Desktop\\a.txt"));
				FileOutputStream out = new FileOutputStream(file)) {
			if (!file.exists())
				file.createNewFile();
			// 在使用时，每次读取都读取一行内容因此要使用循环进行处理，否则复制文件会产生错误
			do {
				i = in.read();
				out.write(i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("happen exception: " + e.getMessage());
		}
		System.out.println("文件复制完成");
	}

}
