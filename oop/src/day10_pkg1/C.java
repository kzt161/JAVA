package day10_pkg1;


public class C extends A{
	//private int a;
	//int b = 10;
	//protected int c = 10;
	public int d = 10;
	
	void test1() {
		//a = 20; //private phyik ny loh khw loh m ya
		b = 20;// ok, default(inherited)
		c = 20;//ok, protected(inherited)
		d = 20;//ok,public(inherited)
	}
}
