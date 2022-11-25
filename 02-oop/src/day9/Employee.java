package day9;

public class Employee {
	
	static int noOfEmployee = 3; //static variable
	static int nextId= 1; //static variable
	String name; //instance variable
	int salary; //instance variable
	final int empId ; //instance block or constructor htl mhr thu' tan phoe pyg loh ya,initialize loke mha ya ml
	
	public Employee() throws AppException {
		if(nextId > noOfEmployee) {
			throw new AppException("Sorry! Limited number has been reached");
		}
		empId = nextId;
		nextId++;
	}
	
	public void init(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public void changeData(String editName, int editSalary) {
		if (this.name.equalsIgnoreCase(editName)) {
			this.name = editName;
		}
		if (this.salary != editSalary) {
			this.salary = editSalary;
		}
	}
	public void showData() {
//		System.out.println(this.empId + "\t" + this.name + "\t" + this.salary );
		System.out.format("%d \t %s \t %d\n", this.empId, this.name, this.salary);
	}
}
	
