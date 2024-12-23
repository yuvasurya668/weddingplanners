package wedding;
import java.util.*; 
public class home
{
	static Scanner sc=new Scanner(System.in);
	static register x=new register();
	static login y=new login();
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Welcome to the Wedding Planner.com");
		System.out.println("If you are an existing customer \npress 1 to login \nIf you want to resgister \npress 2 to register");
		while(true)
		{
			String s=sc.next();
			if(s.equals("1"))
			{
				y.log();
				break;
			}
			else if(s.equals("2"))
			{
				x.sigin();
				break;
			}
			else
			{
				System.out.println("Invalid Input");
				
			}
		}
	}
}
