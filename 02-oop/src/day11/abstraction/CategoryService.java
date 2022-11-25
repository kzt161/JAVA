package day11.abstraction;

import java.util.List;

public class CategoryService extends DatabaseUtil {

	@Override
	public void insert() {
		System.out.println("Insert into category");
	}

	@Override
	public void update() {
		System.out.println("Update category set...");
	}

	@Override
	public boolean delete(int id) {
		System.out.println("Delete from category where id = " + id);
		return false;
	}

	@Override
	public Object findById(int id) {
		System.out.println("");
		return null;
	}

	@Override
	public List<Object> findAll() {
		return null;
	}

}
