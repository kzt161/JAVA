package day7;

public class JavaStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string ka original hr pyn ya dl stringbuffer ka original pyn m ya bo
		StringBuffer buffer  = new StringBuffer("Java Programming");
		
		buffer.append(" is a high level programming language");
		System.out.println("After append, " + buffer);
		
		buffer.insert(0, "PHP,");
		System.out.println("After insert, " + buffer);
		
		buffer.replace(0, 4, "");
		System.out.println("After replace, " + buffer);
		
		System.out.println("Length: " + buffer.length());
		System.out.println("index of 'level': " + buffer.indexOf("level"));
		
		System.out.println("Substring: " + buffer.substring(0, 4));
		
		buffer.delete(0, 4);
		System.out.println("After delete: " + buffer);
	}

}
