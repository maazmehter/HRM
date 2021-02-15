package hrmProject2;

import java.sql.*;


public class connect {
	
	public Connection c;
	public Statement s;	
	
	
	public connect() throws SQLException{
		try {
		String dburl = "jdbc:sqlite:EmpDetails.db";
		c=DriverManager.getConnection(dburl);
		s=c.createStatement();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void disconnect() throws SQLException{
		c.close();	
	}
	
}
