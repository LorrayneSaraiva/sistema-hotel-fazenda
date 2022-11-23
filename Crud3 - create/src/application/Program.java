package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.ParseException;

import db.DB;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program {

	public static void main(String[]  args) {
		
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
						"INSERT INTO operador"
						+ "(nome,email,senha,cpf,rg,salario)"
						+ "VALUES"
						+ "(?, ?, ?, ?, ?, ?)");
			String nome_user = "Lorrayne saraiva";
			st.setString(1, nome_user);
			st.setString(2, "guibolao@gmai.com");
			st.setString(3, "g123");
			st.setString(4, "12345678910");
			st.setString(5, "12345678-x");
			st.setDouble(6, 15500.0);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
		}catch (SQLException e) {
			e.printStackTrace();
			
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		

}
}
