package day12.abstraction;

public class Demo {
	
	public static void main(String[] args) {
//		OnClickListener obj = new OnClickListener(); abstract phyik ny loh obj sout loh m ya
		
		OnClickListener btn1 = new Button("btn-login");//child class ko access hlan u but override htr tk hr bl u loh ya mhr
		
		btn1.onClick();
		btn1.onDoubleClick();
		
		Button btn2 = new Button("btn-logout");
		
		btn2.display();
		btn2.onClick();
		btn2.onDoubleClick();
		
	}
}
