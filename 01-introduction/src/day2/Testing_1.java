package day2;

public class Testing_1 {
	
	//global place(outside all method) - fields loh khw dl(variables)
	private int num2; //instance field/variable
	boolean flag;	// instance field/variable
	static int num3;	// static field/variable
	
	//var ka method apyin mhr th3 loh m ya
	//var name= "Su Su";
	
	public void display() {  //instant method
		//static int num1 = 0;
		//private int num1 = 0;
		//int num1;
		//ek lo hr dwy m ya
		int num1 = 0;
		System.out.println("Num1 =" + num1);
		System.out.println("Num2 =" + num2); //0
		System.out.println("flag =" + flag); //false
		
		var num2 = 100;
		var num3 = 3.5;
		var num4 = "Kyaw Kyaw";
		var num5 = true;
		
		//int a,b,c; d lo ka ya dl
		
		//var a=10, b=23;  d lo ka m ya
		
		//strong data type phyik tk atwat tan phoe htae py ya dl
		//var num5;
		//null ka ll br tan phoe mha m shi tk atwat htae loh m ya
		//var num6 = null;
		//return type mhr ll th3 loh m ya
		//return num1;
		//parameter anay nk kyay nyar ml so yin ll *var* th3 loh m ya
		
		show();
		init();
	}

	//instance method/variable
	//object = instance
	public void show() {
		
	}
	
	public static void init() {
		//just call only static data(variable or method)
		//show(); instance method phyik ny loh khw th3 loh m ya bo,th3 chin yin obj ayin loke ya ml
		add();
		//System.out.println("Num2 =" + num2);
		System.out.println("Num3 =" + num3);
	}
	
	public static void add() {
		
	}
	
	//static method/variable
	//static = class
	public static void main(String[] args) {  //static method
		//display();
		Testing_1 obj = new Testing_1();  //create object
		obj.display();
		System.out.println("Num2 =" + obj.num2);
		
		
		//int num1;
		//System.out.println("Num1 =" + num1);
	}
}
