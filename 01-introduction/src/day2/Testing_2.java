package day2;

public class Testing_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.rno = 1;	//accessing instance data via obj(obj.data)
		
		Student.university_name = "UCSM";	//accessing static/class data via className(className.data)
		
		s1.show();
		
		Student s2 = new Student();
		s2.rno = 2;
		
		s2.show();
		
	}
}
