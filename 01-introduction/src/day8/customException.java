package day8;

public class customException {
	static void validAge(int age) throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException("not allowed");
		}
		else {
			System.out.println("U can smoke.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validAge(20);
		}catch(InvalidAgeException e) {
			System.err.print(e.getMessage());
		}
	}

}
class InvalidAgeException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
