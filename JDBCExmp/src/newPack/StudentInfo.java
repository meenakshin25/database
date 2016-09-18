package newPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentInfo 
{
	void addStudent() throws Exception
	{
		try
		{
			Class.forName("org.h2.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
			
			PreparedStatement pst=con.prepareStatement("insert into employee values(202,'maha','mysore',345627)");
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
			
			System.out.println("DATA is ADDED......");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws Exception
	{
		StudentInfo studentInfo=new StudentInfo();
		studentInfo.addStudent();
	}

}
