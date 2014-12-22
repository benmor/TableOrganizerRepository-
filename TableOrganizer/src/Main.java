import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;


public class Main {
	
	public static void main(String[] args) throws Exception{
	
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TableOrganizer","root","1q2w3e4r");
		
		java.sql.PreparedStatement statement = con.prepareStatement("select * from users");
		
		ResultSet result = statement.executeQuery();
		
		while (result.next())
		{
			System.out.println(result.getString(1) + " " + result.getString(2));
		}
	
	}
}
