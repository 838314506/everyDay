package interfaceTest.constant;

import java.util.Random;


public class Question implements SharedConstants{
	
	Random random = new Random();
	public int ask() {
		int prod = (int) (100 * random.nextDouble());
		
		if(prod < 30)
			return NO;
		if(prod < 60)
			return YES;
		if(prod < 75)
			return LATER;
		if(prod < 98)
			return SOON;
		else
			return NEVER;
	}
	
}
