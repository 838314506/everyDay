package interfaceTest.constant;

public class AskMe implements SharedConstants {

	public static void answer(int result) {
		switch (result) {
		case NO:
			System.out.println("No");
			break;
		case YES:
			System.out.println("Yes");
			break;
		case MAYBE:
			System.out.println("Maybe");
			break;
		case LATER:
			System.err.println("Later");
			break;
		case SOON:
			System.out.println("Soon");
			break;
		case NEVER:
			System.err.println("Never");
			break;
		}
	}
	
	public static void main(String[] args) {
		Question q = new Question();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		q.getString();
	}

}
