package wedding;
import java.sql.*;
public class jdbc 
{
	static Connection con;
	public void connection() throws Exception
	{
		String url="jdbc:mysql://localhost:3306/project";
		String username="root";
		String password="Yuva@143";
		con=DriverManager.getConnection(url,username,password);
	}
	public void insertion(String name,String pass,String number) throws Exception
	{
		connection();
		String ins="insert into login values (?,?,?);";
		PreparedStatement ps=con.prepareStatement(ins);
		ps.setString(1, name);
		ps.setString(2, pass);
		ps.setString(3, number);
		ps.executeUpdate();
	}
	public boolean checking(String name,String pass) throws Exception
	{
		connection();
		String ins="select * from login where username=? and pass=?";
		PreparedStatement ps=con.prepareStatement(ins);
		ps.setString(1,name);
		ps.setString(2, pass);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean numbercheck(String num) throws Exception
	{
		connection();
		String ins="select mobilenumber from login where mobilenumber=?";
		PreparedStatement ps=con.prepareStatement(ins);
		ps.setString(1, num);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void changeusername(String name , String num) throws Exception
	{
		connection();
		String update="update login set username=? where mobilenumber=?";
		PreparedStatement ps=con.prepareStatement(update);
		ps.setString(1, name);
		ps.setString(2, num);
		ps.execute();
	}
	public void changepassword(String pass,String num) throws Exception
	{
		connection();
		String update="update login set pass=? where mobilenumber=?";
		PreparedStatement ps=con.prepareStatement(update);
		ps.setString(1, pass);
		ps.setString(2, num);
		ps.execute();
	}
	public int otp()
	{
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(200);
				System.out.print("* ");
			}
			catch(Exception e) {
				
			}
		}
		int n=1000+(int)(Math.random()*8999);
		return n;
	}
}