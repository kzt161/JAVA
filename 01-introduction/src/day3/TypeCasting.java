package day3;

public class TypeCasting {
	
	public static void main(String[] args) {
		//implicit casting
		int i = 100;
		long j = i;
		
		float a = i;
		
		System.out.println("i =" + i);
		System.out.println("i =" + j);
		System.out.println("a =" + a);
		
		//explicit casting
		short k = (short)i;
		float b = 3.6f;
		int c = (int)b;
		
		System.out.println("k =" + k);
		System.out.println("b =" + b);
		System.out.println("c =" + c);
		
		Person p1 = new Person();
		Student s1 = new Student();
		Teacher t1 = new Teacher();
		
		//implicit casting
		p1 = s1; //convert specialized(child) class to general(parent) class
	
		//explicit casting
		Person p2 = new Person();
		Student t2 = (Student) p1; // convert general(parent) class to specialized class
	}
}

class Person { //general class(parent)
	
}
class Student extends Person { //specialized class(child)
	
}
class Teacher extends Person { //specialized class(child)
	
}