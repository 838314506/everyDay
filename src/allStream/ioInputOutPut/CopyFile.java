package allStream.ioInputOutPut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		int i;
		File file = new File("C:\\Users\\lzz\\Desktop\\b.txt");
		//��try�������������ñ���ʽ������Ϊfinal����˲����ٽ�����ֵ���������
		try (FileInputStream in = new FileInputStream(new File("C:\\Users\\lzz\\Desktop\\a.txt"));
				FileOutputStream out = new FileOutputStream(file)) {
			if (!file.exists())
				file.createNewFile();
			// ��ʹ��ʱ��ÿ�ζ�ȡ����ȡһ���������Ҫʹ��ѭ�����д����������ļ����������
			do {
				i = in.read();
				out.write(i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("happen exception: " + e.getMessage());
		}
		System.out.println("�ļ��������");
	}

}
