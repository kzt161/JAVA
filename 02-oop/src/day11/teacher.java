package day11;

public class teacher extends person{
	
	private String position;
	
	public teacher(String name, String pos) { //name = "U Maung"
		super(name);
		this.position = pos; //Tutor
	}
	@Override
	public void showInfo() {
		super.showInfo(); //this.showInfo nk mhrr tk tl ***
		System.out.println("Position: " + position);
		System.out.println("-----------------");
	}
	
	public void display() {
		System.out.println("This is display method.");
	}
	
}
