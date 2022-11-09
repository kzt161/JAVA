package day15;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMap_Testing {
	
	public static void main(String[] args) {
		
		Tree_Map();
	}
	
	private static void TreeMap() {
		
		TreeMap<Integer, String> students = new TreeMap<>();
		
		students.put(1, "Aung Aung");
		students.put(11, "Naung Naung");
		students.put(2,  "Kyaw Kyaw");
		
		System.out.println("Students: " + students);
		
		students.replace(2,  "Honey");
		System.out.println("After replacing: " + students);
	}
}
