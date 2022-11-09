package day5;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] data = {
				{100, 200},
				{100, 200, 300},
				{100}
		};
		
		System.out.println("-----For Looping-----");
		for (var r = 0; r < data.length; r++) {
			for(var c = 0; c < data[r].length; c++) {
				System.out.println(data[r][c] + "\t");
			}
		}
	}

}
