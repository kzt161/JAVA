package day5;

import java.util.Arrays;

public class array_testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1 = {100,20,200,40,90};
		
		//copy all
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("Arr2: " + Arrays.toString(arr2));
		
		//copy custom
		int[] arr3 = Arrays.copyOfRange(arr1, 1, 3); //arr1 htl ka 1 ka ny 3 hti kuee ml but 3 m pr
		System.out.println("After range copying: " + Arrays.toString(arr3));
		
		//verify two arrays are equal
		System.out.println("arr1 == arr2: " + Arrays.equals(arr1,  arr2));
		System.out.println("arr1 == arr2: " + Arrays.equals(arr1,  arr3));
		
		//sort
		Arrays.sort(arr1);
		System.out.println("After sorting: " + Arrays.toString(arr1));
		
		//search
		System.out.println("Is 90 in array1:" + Arrays.binarySearch(arr1,  90));
		System.out.println("Is 90 in array1:" + Arrays.binarySearch(arr1,  900));
		
		//array tine ko element 7 htae
		Arrays.fill(arr1, 7);
		System.out.println("After filling 7, arr1: " + Arrays.toString(arr1));
		
		//using with Stream API
		int total = Arrays.stream(arr2).sum();
		System.out.println("Total: " + total);
		System.out.println("Maximum: " + Arrays.stream(arr2).max().getAsInt());
		System.out.println("Minimum: " + Arrays.stream(arr2).min().getAsInt());
	}

}
