
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLUtilities {
	
	 public static Connection connect()
	 {
		 Connection conn = null;
		    try {
		        // Load the JDBC driver
		        String driverName = "com.mysql.jdbc.Driver"; // MySQL MM JDBC driver
		        Class.forName(driverName);
		    
		        // Create a conn to the database

		        String url = "jdbc:mysql://localhost:3306/test3?useUnicode=true&characterEncoding=utf8";
		        String username = "hbstudent";
		        String password = "hbstudent";
		        conn = DriverManager.getConnection(url, username, password);
		    } catch (ClassNotFoundException e) {
//				String msg = e.printStackTrace();
		        System.out.println("not found");
		    } catch (SQLException e) {
		         e.printStackTrace();
		        System.out.println("sql exce");
		    }
		    return conn;
	 }
	 
	 public static ResultSet executeSQL(String query, Connection conn)
	 {
		 if (connect()!=null)
		 {
			 try {
				Statement statement = conn.createStatement();
				statement.execute(query);
				return statement.getResultSet();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
		 return null;
	 }
	 
	 public static void disconnect(Connection conn)
	 {
		 if (conn !=null)
		 {
			 try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }

}
