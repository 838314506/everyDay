package allStream.bufferIo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {

	public static void main(String[] args) throws IOException {
		/**
		 * �˶�������ö�ȡ����������������캯����Reader�����ǳ����࣬inputStreamReader��
		 * �������࣬����ཫ�ֽ�תΪ�ַ���
		 * system.in����inputstream���͵Ķ��������̨��������
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
