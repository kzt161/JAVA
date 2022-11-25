package day12.assignment2;

public class Demo {

	public static void main(String[] args) {
		
		String name = "Asuna";
		String nrcno = "12/Asana(naing)13579";
		String address = "Texas";
		String phone = "098765432";
		String orgPosition = "Player";
		String orgDepartment = "100T";
		int orgSalary = 500000;
		String newPosition = "Coach";
		String newDepartment = "NRG";
		int newSalary = 800000;
		
		//person
		Person person1 = new Person(name, nrcno, address, phone);
		System.out.println("---Person's Info---");
		person1.showInfo();
		person1.IdentificationInfo();
		
		//teacher
		System.out.println("---Teacher Info---");
		Teacher teacher1 = new Teacher(name, nrcno, address, phone, orgPosition, orgDepartment, orgSalary);
		teacher1.showInfo();
		teacher1.IdentificationInfo();
		
		System.out.println("After promote......");
		teacher1.promote(newPosition, newSalary);
		System.out.println("------");
		
		System.out.println("After transfer........");
		teacher1.transfer(newDepartment);
		System.out.println("------");

		System.out.println("---Teacher's new Info---");
		teacher1.showInfo();
		teacher1.IdentificationInfo();
		
	}
}
