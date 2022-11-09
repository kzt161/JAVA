package day12.assignment1;

public class Student {
	private int studentId;
	private String name;
	private int mark;
	
	//getters/setters
	public int getstudentId() {
		return studentId;
	}
	public String getname() {
		return name;
	}
	public int getmark() {
		return mark;
	}
	
	//constructors
	public Student(int studentId, String name, int mark) {
		this.studentId = studentId;
		this.name	   = name;
		this.mark	   = mark;	
	}
	
	//method
	public void display() {
		System.out.println("Student Id : " + studentId);
		System.out.println("Name : " + name);
		System.out.println("Marks : " + mark);
	}
}
