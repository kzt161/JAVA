package day5;

import java.util.Scanner;

public class laptopAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double brandPrice [] = new double [4];
		double cPrice = 0;
		double ePrice = 0;
		
		String [][] brands = {{"lenovo", "hp", "samsung", "acer", "dell", "asus"}};
		String [] cpu 	   = {"core i3", "core i5", "core i7", "core i9"};
		double [][] dPrice = {
				{ 230.21,  400.21,  294.2,   693.33,   340.44,    691.99},
				{529.483, 920.483, 676.66, 1594.659, 7833.012,  1591.577},
				{552.504, 960.504, 706.08, 1663.992,  817.056,  1660.776},
				{ 690.63, 1200.63,  882.6,  2076.99,  1021.32,   2075.97}
		};
		
		int row = dPrice.length;
		int col = dPrice[0].length;
		
		System.out.println("Enter brand name: ");
		String userBrand = sc.nextLine();
		System.out.println("Enter CPU: ");
		String userCPU = sc.nextLine();
		
		//for brand
		for(int i = 0; i < brands.length; i++) {
			for(int j = 0; j < brands[0].length; j++) {
				if(userBrand.equals(brands[i][j])) {
					System.out.println(userBrand + " is available.");
				}
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				double oPrice = dPrice[i][j];
				if (userBrand.equals(brands[0][j])) {
					brandPrice[i] = oPrice;
				}
			}
		}
		
		//for cpu
		for(int x = 0; x < cpu.length; x++) {
			if(userCPU.equals(cpu[x])) {
				System.out.println("In brand " + userBrand + "," + userCPU + " is available");
			}
		}
		
		for (int x = 0; x < brandPrice.length; x++) {
			if (userCPU.equals(cpu[x])) {
				cPrice = brandPrice[x];
			}
		}
		//System.out.println(cPrice + "$");
		
		System.out.println("Enter exchange rate: ");
		int rate = sc.nextInt();
		ePrice = cPrice * rate;
		System.out.println("Your Laptop's model: " + userBrand + "," + userCPU + ".");
		System.out.println("Price: " + cPrice + "$");
		System.out.println("Total amount: " + ePrice + "MMK");
		
	}

}
