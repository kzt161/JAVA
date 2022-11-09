package assignment;

public class InsufficientAmountExeption extends Exception {

	private static final long serailVersionUID = 1L;
	
	public InsufficientAmountExeption(String msg) {
		super(msg);
	}
}
