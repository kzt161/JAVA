package day14;

import java.util.ArrayList;
import java.util.List;

class phone{
	String name;
	int price;
	public phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}

public class ArrayList_with_customObj {
	
		public static void main(String[] args) {
			
			List<phone> list = new ArrayList<>();
			
			var obj1 = new phone("samsung", 2000000);
			
			list.add(obj1);
			list.add(new phone("I phone", 5000000));
			list.add(new phone("vivo", 100000));
			list.add(new phone("mi", 3100000));
			
			phone obj2 = list.get(0);
			System.out.println("Name: " + obj2.name);
			System.out.println("Price: " + obj2.price);
			
			//display all
			list.forEach(obj->{
				System.out.println("");
			});
		}
}
