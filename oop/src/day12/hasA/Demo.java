package day12.hasA;

public class Demo {
	public static void main(String[] args) {
		
		Author auth = new Author("Mya Than Tint", "Myaing");
		
		Book book = new Book("War and Peace", 15000, auth);
		
		System.out.println("Book Title: " + book.name);
		System.out.println("Price: " + book.price);
		System.out.println("Author Name: " + book.author.name);
		System.out.println("Author's Native Town: " + book.author.nativeTown);
		
	}
}
