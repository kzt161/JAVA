package day12.abstraction;

public class SelectBox implements OnClickListener,OnKeyChangeListener{

	@Override
	public void onKeyDown() {
		System.out.println("This is onKeyDown method");
	}

	@Override
	public void onKeyPress() {
		System.out.println("This is onKeyPress method");
	}

	@Override
	public void onKeyUp() {
		System.out.println("This is onKeyUp method");
	}

	@Override
	public void onClick() {
		System.out.println("This is onCLick method");
	}

	@Override
	public void onDoubleClick() {
		System.out.println("This is onDoubleClick Method");
	}
}

//class A{
//	
//}
//
//class B{
//	
//} 
//
//class C extends A,B{ yoe yoe class mhr so 2 khu inherited u loh m ya
//	
//}
