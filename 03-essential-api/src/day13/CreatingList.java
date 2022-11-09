package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatingList {
	public static void main(String[] args) {
		
		//way1 (empty/cant modify)
		List<String> list1 = List.of();
//		list1.add("Juice");   list.of nk loke htr tk kg ko change loh m ya bo
		
		//way2 (with data/cant modify)
		List<String> list2 = List.of("Juice", "Coffee");
//		d hr ll change loh m ya
		
		
		Integer[] arr = {100, 200};//int so mhrr dl
		//way3(Fromexisting data, cant modify)
		List<Integer> list3 = Arrays.asList(arr);
//		list3.add("230");
		
		//change chin  yin(new pr yin modify loh ya dl)
		//way4(empty / can modify)
		List<Integer> list4 = new ArrayList<>();
		list4.add(300);
		
		//way5
		List<Integer> list5 = new ArrayList<>(Arrays.asList(arr));
		list5.add(500);
		System.out.println("List5 : " + list5);
	}
}
