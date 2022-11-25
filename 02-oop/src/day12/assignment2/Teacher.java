package day12.assignment2;

public class Teacher extends Person{
	
	private String position;
	private String department;
	private int salary;

	public Teacher(String name, String nrcno, String address, String phone, String position, String department, int salary) {
		
		super(name, nrcno, address, phone);
		this.position = position;
		this.department = department;
		this.salary = salary;
	}
	
	//--
	public String getPosition() {
		return position;
	}
	public String getdepartment() {
		return department;
	}
	public int getsalary() {
		return salary;
	}
	
	//methods
	public void promote(String position, int salary) {
		System.out.println("Org position: " + this.position);
		System.out.println("Org salary: " + this.salary);
		
		this.position = position;
		this.salary = salary;
		
		System.out.println("New position: " + position);
		System.out.println("New salary: " + salary);
	}
	
	public void transfer(String NewDepartment) {
		System.out.println("Org department: " + this.department);
		this.department = NewDepartment;
		System.out.println("New Department: " + department);
	}
	
	public void showTeacherInfo() {
		super.showInfo();
		System.out.println("Position: " + position);
		System.out.println("Salary: " + salary + "MMK");
		System.out.println("Department: " + department);
	}
	
	

}
