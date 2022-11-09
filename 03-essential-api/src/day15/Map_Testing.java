package day15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Testing {
	
	public static void main(String[] args) {
		
		//create
		Map<String, String> foods = new HashMap<>();
		
		//add
		foods.put("orange", "fruit");
		foods.put("grape", "fruit");
		
		//create immutable map obj
		var anotherFoods2 = Map.of("mango", "fruit", "potato", "vegetable");
		
		foods.putAll(anotherFoods2);
		foods.forEach((k, v) -> {
			System.out.println(k + " => " + v);
		});
		
		var anotherFoods3 = Map.ofEntries(
				Map.entry("coffee", "juice"),
				Map.entry("Lemon", "juice")
				);
		foods.putAll(anotherFoods3);
		
		foods.putIfAbsent("kiwi", "juice");
//		foods.put("orange", "juice");
		System.out.println("After adding, foods: " + foods);
		System.out.println("value of kiwi: " + foods.get("kiwi"));
		System.out.println("contain key(coffee): " + foods.containsKey("coffee"));
		System.out.println("contain value(coffee): " + foods.containsValue("coffee"));
		
		//only keys
		Set<String> keys = foods.keySet();
		System.out.println("keys: " + keys);
		
		//only values
		Collection<String> values = foods.values();
		System.out.println("values: " + values);
		
		//remove
		foods.remove("kiwi");
		System.out.println("After removing: " + foods);
		
//		foods.keySet().removeIf( str -> str.contains("o"));
//		foods.values().removeIf(str -> str.equals("fruit"));
		System.out.println("After removing, foods: " + foods);
		
		//update
		foods.replace("mango", "cake");
		System.out.println("After updating, foods: " + foods);
		
		foods.compute("coffee", (k,v) -> "cake");
		System.out.println("value of coffee: " + foods.get("coffee"));
		
	}
}
