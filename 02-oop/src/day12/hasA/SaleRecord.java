package day12.hasA;

import java.time.LocalDate;

public class SaleRecord {
	
	int id;
	LocalDate saleDate;
	Product product;
	int saleQty;
	
	public SaleRecord(int id, LocalDate saleDate, Product product, int saleQty) {
		super();
		this.id = id;
		this.saleDate = saleDate;
		this.product = product;
		this.saleQty = saleQty;
	}
	
	void showData() {
		System.out.println(id + "\t");
		System.out.println(saleDate +"\t");
		System.out.println(product.name + "\t");
		System.out.println(product.price + "\t");
		System.out.println(saleQty + "\t");
		System.out.println();
	}
}
