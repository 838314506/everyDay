package allStream.bufferIo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[100];
		System.out.println("enter text");
		System.out.println("enter stop to exit");
		
		for(int i = 0;i < 100;i ++) {
			str[i] = br.readLine();
			System.out.println(str[i]);
			if(str[i].equals("stop")) break;
		}
		
		
	}

}
