package day12.abstraction;

public interface OnClickListener {//interface mhr no keyword so yin public pyy dr
	
	int FONT_SIZE = 12;//interface mhr so tan phoee htae pyy ya ml
	String FONT_FAMILY = "Arial";
	
	void onClick();
	void onDoubleClick();
}

class Button implements OnClickListener{
	 
	private String name;
	
	public Button(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Button name : " + name);
		System.out.println("Font Size : " + FONT_SIZE);
		System.out.println("Font Family : " + FONT_FAMILY);
	}
	
	@Override
	public void onClick() {//class htl mhr ka no key word so default pyy dr...ek dr kyount tu ag pyaung py ya ml
		System.out.println("This is onClick method.");
	}
	
	@Override
	public void onDoubleClick() {
		System.out.println("This is onDoubleClick method.");
	}
}
