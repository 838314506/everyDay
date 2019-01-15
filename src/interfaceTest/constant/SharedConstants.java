package interfaceTest.constant;

public interface SharedConstants {
	
	public final int NO = 0;
	public final int YES = 1;
	public final int MAYBE = 2;
	public final int LATER = 3;
	public final int SOON = 4;
	public final int NEVER = 5;
	
	default void getString() {
		System.out.println("this is default method belong to interface");
	}
}
