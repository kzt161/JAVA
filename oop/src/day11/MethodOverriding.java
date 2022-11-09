package day11;

public class MethodOverriding {
	
	public static void main(String[] args) {
		teacher teacher1 = new teacher("U Maung", "Tutor");
		
		teacher1.showInfo();
		
		person person1 = new person("U Aung");
		person1.showInfo();
		
		person person2 = new teacher("U Kyaw","Lecturer");
		person2.showInfo();
		
		//person2.display();
	}
}
