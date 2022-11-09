package day14;

import java.util.Stack;

public class Stack_testing {
	
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("Tamago");
		stack.push("Ringo");
		stack.push("Tenpura");
		
		System.out.println("[0] ; " + stack.get(0));
		
		//remove
		stack.pop();
		System.out.println("After removing: " + stack.get(0));
	}
}
