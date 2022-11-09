package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Testing2 {
	
	public static void main(String[] args) {
		
		String[] data = {"Aung Aung", "Kyaw Kyaw", "Maung Maung", "Jeon", "Yuki"};
		ArrayList<String> names = new ArrayList<>(Arrays.asList(data));
		
		names.add("Jeon");
		
		System.out.println(names);
		
		//sorting
		Collections.sort(names);
		System.out.println("After sorting: " + names);
//		Collections.reverse(names);
//		System.out.println("Reverse sorting: " + names);
		
		//searching
		int index = Collections.binarySearch(names, "Kyaw Kyaw");
		System.out.println("Searching : " + index);
	}
}
