package db_test_script;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
 
public class db_test_script {
 
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//Loading the required JDBC Driver class
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://vsubmission:1433;DatabaseName=MIS_DB;user=mtbcweb;Password=mtbcweb@mtbc"); 
		
		//if (conn != null) {
        //    System.out.println("Connection Successful!");
		
		//Executing SQL query and fetching the result
		Statement st = conn.createStatement();
		
		String sqlStr = "select * From patient where practice_code = '9090999' and last_name = 'kalim'";
		ResultSet rs = st.executeQuery(sqlStr);
		while (rs.next()) {
		System.out.println(rs.getString("Patient_Account"));
		
            
		}		
	}
}
