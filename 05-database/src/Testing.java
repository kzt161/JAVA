import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//*sql nk sine tr twy bl u ya ml*

public class Testing {
	 
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mariadb://localhost:3306/testing_java";
		String username = "root";
		String password = "";
		
		//create connection
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("got connection");
		
		//create statement
		Statement st = con.createStatement();
		System.out.println("statement created");
		
		//define query
		String query = """
				INSERT INTO employees(emp_no, emp_name, city, birthday, bonus, salary)
				VALUES('1005', 'o.o', 'Onigashima', '2003-1-16', 1.5, 800000)
				""";
		
		//execute query
		int numbers = st.executeUpdate(query);
		if(numbers > 0) {
			System.out.println("success");
		}else {
			System.out.println("failed");
		}
		
		//lote sayr loke pe yin pate ya ml(close connection)
		con.close();
		
		
	}
}
