package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Mapping_2 {
	
	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("Cola", "Milk Tea", "Pessi");
		List<String> list2 = List.of("Burger", "Kyay Oh", "Noodle", "Cake");
		List<String> list3 = List.of("Ice cream", "Cake");
		
		List<List<String>> list = new ArrayList<>();
				
		list.add(list1);
		list.add(list2);
		list.add(list3);
		
//		System.out.println("Before flatmap: " + list);
		System.out.println("Size of list: " + list.size());
		for(var i = 0; i < list.size(); i++) {
			List<String> tmp = list.get(i);
			System.out.println(tmp);
		}
		
		Set<String> set = list.stream()
							.flatMap(value -> value.stream()) //List<string> => Stream<String> pyg pyy lyk tr
							.collect(Collectors.toSet());
		
		System.out.println("size of set: " + set.size());
		System.out.println("After faltmap: " + set);
							
	}
}
