package day21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBaseService {
	
	public static Connection createConnection() throws SQLException {
		
		var url = "jdbc:mariadb://localhost:3306/testing_java";
		var user_name = "root";
		var password = "";
		
		Connection con = DriverManager.getConnection(url, user_name, password);
		
		return con;
		
	}
	
	
	public static void closeConnection(Connection con) throws SQLException {
		
		if(con != null) {
			con.close();
		}
	}
	
	
	public static void save(String item_name, float price) throws SQLException {
		
		Connection con = createConnection();
		
		var query = "INSERT INTO products(name, price)VALUES(?, ?)";
		
		//create preparedstatement
		PreparedStatement pstm = con.prepareStatement(query);
		
		//define param value
		pstm.setString(1, item_name);
		pstm.setFloat(2, price);
		
		//execute
		pstm.executeUpdate();
		
		closeConnection(con);
		
	}
	
	
	public static void update(String item_name, float price, int product_id) throws SQLException {
		
		Connection con = createConnection();
		
		var query = "UPDATE products SET price = ?, name = ? WHERE id = ?";
		
		//create preparedstatement
		PreparedStatement pstm = con.prepareStatement(query);
		
		//define param value
		pstm.setFloat(1, price);
		pstm.setString(2, item_name);
		pstm.setInt(3, product_id);
		
		//execute
		pstm.executeUpdate();
		
		closeConnection(con);
		
	}
	
	
	public static void deleteByID(int id) throws SQLException {
		
		Connection con = createConnection();
		
		var query = "DELETE FROM products WHERE id = ?";
		
		PreparedStatement pstm = con.prepareStatement(query);
		
		pstm.setInt(1, id);
		
		pstm.executeUpdate();
		
		closeConnection(con);
		
	}
	
	
	public static void deleteAll() throws SQLException {
		Connection con = createConnection();
		
		var query = "DELETE FROM products";
		
		PreparedStatement pstm = con.prepareStatement(query);
		
		pstm.executeUpdate();
		
		closeConnection(con);
	}
	
	public static List<Product> findAll(){
		List<Product> data = new ArrayList<>();
		
		try(Connection con = createConnection()) {
			
			var query = "SELECT * FROM products";
			//SELECT id, name, price from products;
			
			PreparedStatement pstm = con.prepareStatement(query);
			
			pstm.executeQuery(); //select moh loh executequery th3 dr
			
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				
				//create new product obj
				Product prod = new Product();
				
				//retrive from resultset
				int productId = rs.getInt(1);//() htl ka column index
				String productName = rs.getString("name");
				float productPrice = rs.getFloat("price");
				
				//convert column to field
				prod.setId(productId);
				prod.setName(productName);
				prod.setPrice(productPrice);
				
				//add to list
				data.add(prod);
				
			}
		} catch (Exception e) {
			
		}
		return data;
	}
	
	public static Product findbyId(int productId) {

		Product product = null;
		
		try(Connection con = createConnection()) {
			
			var query = "SELECT * FROM products WHERE id = ?";
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, productId);
			
			var rs = pstm.executeQuery();
			if(rs.next()) {
				product = new Product();
				product.setId(productId);
				product.setName(rs.getString("name"));
				product.setPrice(rs.getFloat(productId));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
		
	}
	
}
