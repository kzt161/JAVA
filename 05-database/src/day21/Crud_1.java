package day21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Crud_1 {
	
	public static void main(String[] args) {
		
		var url = "jdbc:mariadb://localhost:3306/testing_java";
		var user_name = "root";
		var password = "";
		
		
		try(Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection(url, user_name, password)) {
			
			//get input from user
			System.out.println("Enter item name: ");
			String input_name = sc.nextLine();
			
			System.out.println("Enter price: ");
			float input_price = Float.parseFloat(sc.nextLine());
			
			//save it to database
//			statement(con, input_name, input_price);
			prepareStatement(con, input_name, input_price);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	prepareStatement
	private static void prepareStatement(Connection con, String input_name, float input_price) throws SQLException {
		
//		var query = "INSERT INTO products(name, price)VALUES('" + input_name + "'," + input_price + ")";
		var query = "INSERT INTO products(name, price)VALUES(?, ?)"; //? yk tan phoe twy thk mhk py ya ml
		
		//created prepare statement
		PreparedStatement pst = con.prepareStatement(query);
		
		//define param values( of ? )
		//index nk thk mhk *d mhr index ka 1 ka sa dl 0 ka m sa bo 
		//d mhr so index 1 = name, 2 = price
		//pst.setXXX(position, value);    [XXX = data type(eg.var,int,...)]
		//set pee yin get lr ml 
		pst.setString(1, input_name);
		pst.setFloat(2, input_price);
		
		pst.executeUpdate();
		System.out.println("success");
		
	}

//	statement
	private static void statement(Connection con, String input_name, float input_price) throws SQLException {

		var query = "INSERT INTO products(name, price)VALUES('" + input_name + "'," + input_price + ")";
		System.out.println("query => " + query);
		
		Statement st = con.createStatement();
		
		st.executeUpdate(query);
		System.out.println("success");
	}
}
