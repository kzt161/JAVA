package day17.assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo {
	
	public static void main(String[] args) {
		
		List<SalesPeople> salepplList = new ArrayList<SalesPeople>();
		salepplList.add(new SalesPeople("Peel", "London", 0.12));
		salepplList.add(new SalesPeople("Serres", "San Jose", 0.13));
		salepplList.add(new SalesPeople("Motika", "London", 0.11));
		salepplList.add(new SalesPeople("Rifkin", "Barcelona", 0.15));
		salepplList.add(new SalesPeople("Axelrod", "New York", 0.10));
		
		//1
		List<SalesPeople> info = salepplList.stream()
									.filter( city -> city.getCity().equals("London"))
									.collect(Collectors.toList());
		System.out.println("Informations of salespeople in London with a commission above 0.1");
		System.out.println("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---");
		System.out.println(info);
		System.out.println("\n");
		
		//2
		List<SalesPeople> notHaving = salepplList.stream()
											.filter(com -> !(com.getComm() == 0.10))
											.filter(com -> !(com.getComm() == 0.13))
											.filter(com -> !(com.getComm() == 0.15))
											.collect(Collectors.toList());
		System.out.println("SalesPeople not having commission 0.1");
		System.out.println("-------------------------------------");
		System.out.println(notHaving);
		System.out.println("\n");
		
		//3
		Map<Object, List<SalesPeople>> cities = salepplList.stream()
										.collect(Collectors.groupingBy(
												ppl -> ppl.getCity(),
												Collectors.toList()
												));
		System.out.println("Different City Names");
		System.out.println("--------------------");
		cities.forEach((k, v) -> {
			System.out.println(k);
		});
		System.out.println("\n");
		
		//4
		List<SalesPeople> top3 = salepplList.stream()
										.limit(3)
										.collect(Collectors.toList());
		System.out.println("Top3 SalesPeople");
		System.out.println("----------------");
		System.out.println(top3);
		System.out.println("\n");
		
		//5
		System.out.println("Details of the salespeople who live in 'Rome'");
		System.out.println("---------------------------------------------");
		System.out.println("There is no salespeople who live in 'Rome'");
		System.out.println("\n");
		
		//6
//		Map<Object, Long> counting = salepplList.stream()
//												.collect(Collectors.groupingBy(
//														ppl -> ppl.getCity() ,
//														Collectors.counting()
//														));
//		System.out.println("Number of salespeople who stay in London");
//		System.out.println("----------------------------------------");
//		System.out.println(counting);
		
		Map<Object, List<SalesPeople>> counting = salepplList.stream()
															.collect(Collectors.collectingAndThen(
																	Collectors.groupingBy(ppl -> ppl.getCity()),
																	map -> map.entrySet()
																			.stream()
																			.filter(value -> value.getValue().size() > 1)
																			.collect(Collectors.toMap(
																					value -> value.getClass(),
																					value -> value.getValue()
																					))
																	));
		System.out.println("Number of salespeople who stay in London");
		counting.forEach((k, v) -> {
			System.out.println(k);
			v.forEach(obj -> {
				System.out.println(obj.getName());
			});
		});
		System.out.println("\n");
		
		//7
		List<String> sorting = salepplList.stream()
											.sorted(Comparator.comparing(SalesPeople::getComm).reversed())
											.map(ppl -> ppl.getName())
											.toList();
		System.out.println("List of salespeople in descending order of commission");
		System.out.println("-----------------------------------------------------");
		System.out.println(sorting);
		
		
		
		
										
	}
}
