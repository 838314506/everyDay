package allStream.ioInputOutPut;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile {

	public static void main(String[] args) {
		int i;
		//ʹ�ô��ַ�ʽ������������finally���У��ж�����������ò�Ϊ�գ���ô�ͽ�����Դ�Ĺرգ���������ö���
		//����йر�
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
				System.out.println("�ر����쳣��");
			}
		}
	}
}
