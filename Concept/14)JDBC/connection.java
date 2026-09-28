import java.sql.*;


class SqlConnection
{
	public static void main(String args[])
	{
		try{
			Connection con;
			con=DriverManager.getConnection("jdbc:sqlserver://SKY\\SQLEXPRESS;databaseName=issjavadb;encrypt=true;integratedSecurity=true;trustServerCertificate=true");
			System.out.println("Connection Successful");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
