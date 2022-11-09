package day8;

public class throwingException {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		// TODO Auto-generated method stub
		try {
			checkMark(200);
			int [] data = {100, 200, 300};
			int index = 5;
			
			if(index >= data.length) {
				//manually throw loke dr
				ArrayIndexOutOfBoundsException obj = new ArrayIndexOutOfBoundsException("Index out of range"); //buildin shi pe thr dwy so d hr ka loke sayr tg m lo
				throw obj;
			}
			
			System.out.print("Result: " + data[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.err.print(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void checkMark(int mark) {
		if(mark < 0 || mark > 100) {
			throw new ArithmeticException("Invalid Mark");
		}
	}

}
