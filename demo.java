package e1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import oracle.jdbc.driver.OracleDriver;

public class demo {

	
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet res;
	

	public demo() {
		try {
			DriverManager.registerDriver(new OracleDriver());
			con=DriverManager.getConnection("jdbc:oracle:thin://@localhost:1521/XE","system","system");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void insertion(String id,String name,String role) {
		try {
			stmt=con.prepareStatement("insert into employee(Employee_id,Employee_name,Employee_role) values(?,?,?)");
			
			stmt.setString(1, id);
			stmt.setString(2, name);
			stmt.setString(3, role);
			stmt.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}	
}
