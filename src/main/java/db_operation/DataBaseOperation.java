package db_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseOperation {

	static Connection con ;
	static Statement stmt ;
	
	static {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ShopManagementJavaFxDB" , "root" , "Gaurav@8423");
			stmt = con.createStatement();
			} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void ExecuteQuery(String Query ) {
		try {
			stmt.execute(Query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static ResultSet ExecuteQueryGetResult(String Query) {
		ResultSet rs = null ;
		try {
			rs = stmt.executeQuery(Query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs ;
		
		
	}
}
