package day11.abstraction;

public class demo {
	public static void main(String[] args) {
//		DatabaseUtil util = new DatabaseUtil(); (cant create)
		
		DatabaseUtil util = new ProductService();
		util.connect_db();
		util.insert();
		util.update();
		util.delete(1001);
		util.findAll();
		util.findById(1002);
		
		System.out.println("---------");
		util = new CategoryService();
		util.insert();
	}
}
