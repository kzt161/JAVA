package day7;

import java.util.Arrays;

public class JavaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java Programming";
		
		String s2 = new String(new char[] {'M', 'M', 'I', 'T'});
		
		System.out.println("Len of s1: " + s1.length());
		System.out.println("Len of s2: " + s2.length());
		
		String tmp = s1.toLowerCase();
		System.out.println("After change case, s1: " + s1);
		System.out.println("After change case, tmp: " + tmp);
		
		tmp = s1.replace("Java", "PHP");
		System.out.println("After replacing java with php, s1: " + s1);
		System.out.println("After replacing java with php, tmp: " + tmp);
		
		tmp = s1.concat(" is a high level programming language");
		System.out.println("After concat, s1: " + s1);
		System.out.println("After concat, tmp: " + tmp);
		
		tmp = s1.substring(3, 6);
		System.out.println("Substring, tmp: " + tmp);
		
		System.out.println("Contain 'php' in s1: " + s1.contains("php"));
		System.out.println("Start with java: " + s1.startsWith("Java"));
		
		int index = s1.indexOf("a");
		System.out.println("Index: " + index);
		index = s1.lastIndexOf("a");
		System.out.println("Last index: " + index);
		
		//eg 
		var str = "agag@gmail.com";
		int start = str.indexOf("@");
		int end = str.indexOf(".");
		
		tmp = str.substring(start + 1, end);
		System.out.println("tmp: " + tmp);
		
		str = "Her wave made me flattered";
		String [] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println("total words: " + arr.length);
		
		//string=> primitive data type (Wrapper.parseXXX(""))
		//other obj=> string (String.value(obj))
		
		int num = 100;
		tmp = String.valueOf(num);
	}

}
