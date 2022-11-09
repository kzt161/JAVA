package day13;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Testing {
	
	public static void main(String[] args) {
		
		//create
		ArrayList<Integer> list = new ArrayList<>();
		
		//add
		list.add(100);
		list.add(200);
		list.add(0, 300);//(index number, value)
		
		//output
		System.out.println("list[0] ; " + list.get(0));
		System.out.println("Data: " + list);
		
		//update
		list.set(2,  500);
		System.out.println("After updating: " + list );
		
		//remove
		list.remove(1);
		System.out.println("After rmoving: " + list);
		
		//finding maximum
		System.out.println("Max: " + Collections.max(list));
		
		System.out.println("---All Data---");
//		for(var i=0; i< list.size(); i++)
//			System.out.println(list.get(i));
		
//		var i =0;
//		while(i < list.size()) {
//			System.out.println(list.get(i));
//			i++;
//		}
		
//		for(Integer data: list) {
//			System.out.println(data);
//		}
	}
}
