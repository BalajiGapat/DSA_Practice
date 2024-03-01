package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaJDBC 
{
	public static void main(String[] args) throws SQLException
	{
		System.out.println("==========================================================");
		
		String url = "jdbc:mysql://localhost:3306/dac22?user=root&password=root";
		Connection con4=DriverManager.getConnection(url, "root", "root");
		Statement st=con4.createStatement(); 
		ResultSet rs=st.executeQuery("select * from my_emp");
		
		while (rs.next()) 
		{
		    System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getDouble(4) + ", " + rs.getString(5) + ", " + rs.getDate(6));
		}
		
		System.out.println("==========================================================");
		
		PreparedStatement pst = con4.prepareStatement("select * from my_emp");
		rs = pst.executeQuery();

		while (rs.next()) 
		{
		    System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getDouble(4) + ", " + rs.getString(5) + ", " + rs.getDate(6));
		}
	}
}
