package day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_Testing {
	
	public static void main(String[] args) {
		
		//create mutable(Changeable) set obj
		HashSet<String> set1 = new HashSet<>();
		
		//add
		set1.add("Orange");
		set1.add("Apple");
		set1.add(null);
		set1.add("Strawberry");
		set1.add("Mango");
		
		System.out.println("Set1: " + set1);
		
		//remove
		set1.remove("Mango");
		System.out.println("After removing: " + set1);
		
		//create immutable(Unchangeable) set obj
		Set<String> set2 = Set.of("Banana", "Pineapple");
		
		//add
		set1.addAll(set2);
		System.out.println("After adding, set1: " + set1);
		
		set1.add("Orange");
	}
	
	private static void linkhashset() {
		
		//create mutable(Changeable) set obj
				LinkedHashSet<String> set1 = new LinkedHashSet<>();
				
				//add
				set1.add("Orange");
				set1.add("Apple");
				set1.add(null);
				set1.add("Strawberry");
				set1.add("Mango");
				
				System.out.println("Set1: " + set1);
				
				//remove
				set1.remove("Mango");
				System.out.println("After removing: " + set1);
				
				//create immutable(Unchangeable) set obj
				Set<String> set2 = Set.of("Banana", "Pineapple");
				
				//add
				set1.addAll(set2);
				System.out.println("After adding, set1: " + set1);
				
				set1.add("Orange");
	}
	
	private static void hashset() {
		
		//create mutable(Changeable) set obj
				HashSet<String> set1 = new HashSet<>();
				
				//add
				set1.add("Orange");
				set1.add("Apple");
				set1.add(null);
				set1.add("Strawberry");
				set1.add("Mango");
				
				System.out.println("Set1: " + set1);
				
				//remove
				set1.remove("Mango");
				System.out.println("After removing: " + set1);
				
				//create immutable(Unchangeable) set obj
				Set<String> set2 = Set.of("Banana", "Pineapple");
				
				//add
				set1.addAll(set2);
				System.out.println("After adding, set1: " + set1);
				
				set1.add("Orange");
	}
	
	private static void treeSet() {
		
			//create mutable(Changeable) set obj
				TreeSet<String> set1 = new TreeSet<>();
				
				//add
				set1.add("Orange");
				set1.add("Apple");
				set1.add(null);
				set1.add("Strawberry");
				set1.add("Mango");
				
				System.out.println("Set1: " + set1);
				
				//remove
				set1.remove("Mango");
				System.out.println("After removing: " + set1);
				
				//create immutable(Unchangeable) set obj
				Set<String> set2 = Set.of("Banana", "Pineapple");
				
				//add
				set1.addAll(set2);
				System.out.println("After adding, set1: " + set1);
				
				Iterator<String> it = set1.iterator();
				it.forEachRemaining( s-> System.out.println(s));
				
				Set<String> set3 = set1.descendingSet();
				System.out.println("set3: " + set3);
	}
}
