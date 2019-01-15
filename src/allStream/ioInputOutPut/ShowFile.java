package allStream.ioInputOutPut;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile {

	public static void main(String[] args) {
		int i;
		//使用此种方式，可以灵活地在finally块中，判断如果对象引用不为空，那么就进行资源的关闭，如果有引用对象
		//则进行关闭
		FileInputStream file = null;

		try {
			file = new FileInputStream("");
			i = file.read();
			if (i != -1)
				System.out.println((char) i);
		} catch (IOException e) {
			System.out.println("happen exception");
		} finally {

			try {
				if (file != null)
					file.close();
			} catch (IOException e) {
				System.out.println("关闭流异常！");
			}
		}
	}
}
