package day9;

public class testing {
	public static void main(String[] args) {
		try {
			//create obj
			Employee emp1 = new Employee();
			var emp2 = new Employee();
			var emp3 = new Employee();
			
			//init data
			emp1.init("Kyaw Kyaw", 10000);
			emp2.init("Zaw Zaw", 10000);
			emp3.init("Aung Aung", 12000);
			
			emp3.changeData("Min Min", 15000);
			
			//var emp4 = new Employee();
			
			//show data
			System.out.println("ID \t Name \t \t Salary");
			System.out.println("---------------------------------");
			emp1.showData();
			emp2.showData();
			emp3.showData();
			System.out.println("After changing: ");
			emp3.showData();
			
			//emp4.showData();
			
		}catch(AppException e){
			System.err.print(e.getMessage());
		}
	}
}
