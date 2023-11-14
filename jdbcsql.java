package jeevan;
import java.sql.*;
public class jdbcsql
{

	public static void main(String[] args) 
	{
		
		
		try 
		{
			//Load& Registering the driver and 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Driver registered successfully!");
			
			// EstablishConnection
			
			String url ="jdbc:mysql://localhost:3306/campusx";
			String userName="root";
			String password="yourpassword";
			Connection connect=DriverManager.getConnection(url, userName, password);
			
			System.out.println("Established connection!");
			
			//Create the Statement
			
			Statement stmnt=connect.createStatement();
			
			//execute query
			
//			String query="INSERT INTO studentinfo (sid, sname, sage, saddr)"
//					+ " VALUES(2, 'Kohli', 18, 'Bangalore')";
			
			ResultSet result=stmnt.executeQuery("select * from Persons");
			
			while(result.next()) {
				
				
				  System.out.println(result.getInt(1)+ "\t" +result.getString(2));
				
			}
			
			//close resources
			System.out.println(result);
			stmnt.close();
			connect.close();
			
			
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
