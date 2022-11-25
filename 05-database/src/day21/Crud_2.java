package day21;

import java.util.List;
import java.util.Scanner;

public class Crud_2 {
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			String data = """
					1. add
					2. update
					3. delete according to ID
					4. delete all
					5. select all
					Choose your option: 
					""";
			
			System.out.println(data);
			int input = Integer.parseInt(sc.nextLine());
			
			switch(input) {
			case 1:
				add(sc);
				break;
				
			case 2:
				update(sc);
				break;
				
			case 3:
				DataBaseService.deleteAll();
				break;
				
			case 4:
				System.out.print("Enter product ID you want to delete: ");
				int id = Integer.parseInt(sc.nextLine());
				DataBaseService.deleteByID(id);
				break;
				
			case 5:
				select(sc);
				break;
				
			default:
				break;
				
			}
			
		} catch (Exception e) {
			
		}
	}

	private static void select(Scanner sc) {
		// TODO Auto-generated method stub
		
		String data = """
				1. All products
				2. Single product
				3. Search with name
				4. Filter by price
				5. Sort by price
				6. New Arrival
				Choose option: 
				""";
		System.out.println(data);
		var input = Integer.parseInt(sc.nextLine());
		if(input == 1) {
			List<Product> list = DataBaseService.findAll();
			if(list.size() == 0) {
				System.err.println("There is no data");
			}else {
				System.out.println("ID \t Name \t Price");
				System.out.println("===================");
				list.forEach(obj -> {
					System.out.println(obj.getId() + "\t" + obj.getName() + "\t" + obj.getPrice() + "ks");
				});
			}
		}//end of all product
		else if(input == 2) {
			System.out.println("Enter product id: ");
			int productId = Integer.parseInt(sc.nextLine());
			Product prod = DataBaseService.findbyId(productId);
			if(prod == null) {
				System.err.println("Product with this id doesnt exist");
			}else {
				System.out.println("ID: " + prod.getId());
				System.out.println("Name: " + prod.getName());
				System.out.println("Price: " + prod.getPrice());
			}
		}//end of single product
		
	}

	private static void update(Scanner sc) {
		// TODO Auto-generated method stub
		try {
			
			System.out.println("Enter product id to update:");
			var id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter new data");
			System.out.println("Name: ");
			var name = sc.nextLine();
			System.out.println("Price: ");
			var price = Float.parseFloat(sc.nextLine());
			
			DataBaseService.update(name, price, id);
			System.out.println("update success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private static void add(Scanner sc) {
		// TODO Auto-generated method stub
		
		try {
			
			System.out.println("Enter data for new product:");
			System.out.println("Name: ");
			var name = sc.nextLine();
			System.out.println("Price: ");
			var price = Float.parseFloat(sc.nextLine());
			
			DataBaseService.save(name, price);
			System.out.println("adding success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
