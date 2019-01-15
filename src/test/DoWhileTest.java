package test;

import java.io.IOException;

public class DoWhileTest {
	
	public static void main(String[] args) throws IOException {
		char choice;
		do {
			System.out.println("Help on:");
			System.out.println("1.if");
			System.out.println("2.switch");
			System.out.println("3.while");
			System.out.println("4.do/while");
			System.out.println("5.for");
			choice = (char) System.in.read();
		}while(choice < '1' || choice > '5');
		
		switch(choice) {
		case '1':
			System.out.println("welcom to if learn!");
			break;
		case '2':
			System.out.println("welcom to switch learn!");
			break;
		case '3':
			System.out.println("welcom to while learn!");
			break;
		case '4':
			System.out.println("welcom to do/while learn!");
			break;
		case '5':
			System.out.println("welcom to for learn!");
			
		}
	}

}
