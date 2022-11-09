package day11.abstraction;

import java.util.List;

public class ProductService extends DatabaseUtil {

	@Override
	public void insert() {
		System.out.println("Insert into product");
	}

	@Override
	public void update() {
		System.out.println("Update product set");
	}

	@Override
	public boolean delete(int id) {
		System.out.println("Delete from product where id = " + id);
		return false;
	}

	@Override
	public Object findById(int id) {
		System.out.println("Select * from product id = " + id);
		return null;
	}

	@Override
	public List<Object> findAll() {
		System.out.println("Select * from product");
		return null;
	}
	
	
}
