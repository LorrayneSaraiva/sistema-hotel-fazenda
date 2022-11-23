package application;

import java.sql.Connection;
import java.sql.Statement;
import db.DB;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program {

	public static void main(String[]  args) {
		
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.createStatement();
			
			rs = st.executeQuery("select * from adm");
			
			while (rs.next()) {
				System.out.println(rs.getString("nome")+"," + " " + rs.getString("senha"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultset(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
	
}
