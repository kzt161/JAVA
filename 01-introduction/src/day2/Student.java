package day2;

public class Student {
	
	public int rno;						//instance field
	static String university_name;	//static field
	
	void show() {
		System.out.println("Row number =" + rno);
		System.out.println("University name =" + university_name);
	}
}
