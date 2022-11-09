package day13;

import java.util.ArrayList;
import java.util.List;


public class lambda_with_collection {
	
	public static void main(String [] args) {
		List<String> languages = List.of("Java", "Javascript", "Spring with Java");
		
//		List<int> numbers = new ArrayList<>();
		List<Integer> numbers = new ArrayList<>();
		numbers.add(100);
	
		
		int[] arr  = new int[3];
		arr[0] = 100;
		
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("size of arr: " + arr.length);
		System.out.println("numbers[0] = " + numbers.get(0));
		System.out.println("size of numbers = " + numbers.size());
		
		numbers.add(200);
		System.out.println("size of number after adding = " + numbers.size());
		
//		for(String data: languages) {
//			if(data.toLowerCase().contains("java")) {
//				System.out.println(data);
//			}
//		}
		
		languages.forEach(data -> {
			if(data.toLowerCase().contains("java")) {
				System.out.println(data);
			}
		});
	}
}
