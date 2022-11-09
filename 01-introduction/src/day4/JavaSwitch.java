package day4;

import java.util.Scanner;

public class JavaSwitch {
	
	public static void main(String[] args) {
		
		//switch_statement();
		//multipleValuePerCase();
		//switchExpression();
		switchExpressionWithMultipleStatement();
	}
	private static void multipleValuePerCase() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Food name: ");
		String name = sc.nextLine();
		String category;
		
		switch(name) {
		case "burger", "pizza", "sandwish":
			category = "Fast Food";
			break;
		case "yogurt", "milk tea":
			category = "Dessert";
			break;
		case "mote hin khar":
			category = "Burmese Food";
			break;
		case "sushi":
			category = "Japnaese Food";
			break;
			default:
				category = "Unknown";
		}
		
		System.out.println(name + " is " + category);
		sc.close();
	}
	private static void switch_statement() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Food name: ");
		String name = sc.nextLine();
		String category;
		
		switch(name) {
		case "burger":
			category = "Fast Food";
			break;
		case "pizza":
			category = "Fast Food";
			break;
		case "sandwish":
			category = "Fast Food";
			break;
		case "yogurt":
			category = "Dessert";
			break;
		case "milk tea":
			category = "Dessert";
			break;
		case "mote hin khar":
			category = "Burmese Food";
			break;
		case "sushi":
			category = "Japnaese Food";
			break;
			default:
				category = "Unknown";
		}
		
		System.out.println(name + " is " + category);
		sc.close();
	}
	
	private static void switchExpression() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Food name: ");
		String name = sc.nextLine();
		String category = switch(name) {
			case "burger", "pizza", "sandwish" -> "Fast Food";
			case "yogurt", "milk tea" -> "Dessert";
			case "mote hin khar" -> "Burmese Food";
			case "sushi" -> "Japanese Food";
			default -> "unknown";
		};
		
//		switch(name) {
//		case "burger", "pizza", "sandwish":
//			category = "Fast Food";
//			break;
//		case "yogurt", "milk tea":
//			category = "Dessert";
//			break;
//		case "mote hin khar":
//			category = "Burmese Food";
//			break;
//		case "sushi":
//			category = "Japnaese Food";
//			break;
//			default:
//				category = "Unknown";
//		}
		
		System.out.println(name + " is " + category);
		sc.close();
	}
	
	private static void switchExpressionWithMultipleStatement() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Food name: ");
		String name = sc.nextLine();
		String category = switch(name) {
			case "burger", "pizza", "sandwish" -> {
				if(name.equalsIgnoreCase("pizza"))
					System.out.println(name + " is an Italian Food");
				yield "Fast Food";
			}
			case "yogurt", "milk tea" -> "Dessert";
			case "mote hin khar" -> "Burmese Food";
			case "sushi" -> "Japanese Food";
			default -> "unknown";
		};
		
		System.out.println(name + " is " + category);
		sc.close();
	}
}
