package wedding;
import java.util.*;
public class login {
	static Scanner sc=new Scanner(System.in);
	static jdbc x=new jdbc();
	static register y=new register();
	static display z=new display();
	public void log() throws Exception
	{
		System.out.println("Enter your credentials.");
		System.out.print("Username : ");
		String name=sc.next();
		System.out.print("Password : ");
		String pass=sc.next();
		if(x.checking(name,pass))
		{
			System.out.println("Login Sucessful");
			z.display1();
		}
		else
		{
			System.out.println("Invalid credentials. \nPress, \n1 to reset username, \n2 to reset password, \n3 to login again. \nIf You dont have account,\npress 4 to register, \nAny key to exit.");
			String in=sc.next();
			if(in.equals("1"))
			{
				changename();
			}
			else if(in.equals("2"))
			{
				changepass();
			}
			else if(in.equals("3"))
			{
				log();
			}
			else if(in.equals("4"))
			{
				y.sigin();
			}
			else 
			{
				System.out.print("Thank You");
			}
		}
	}
	public void changename() throws Exception
	{
		System.out.print("Enter your Mobile Number : ");
		String num=sc.next();
		boolean b=false;
		if(x.numbercheck(num))
		{
			while(true)
			{
				int n=x.otp();
				System.out.println("Otp sent.\n"+n);
				System.out.print("OTP : ");
				String in=sc.next();
				String otp=String.valueOf(n);
				if(in.equals(otp))
				{
					b=true;
					break;
				}
				else
				{
					System.out.println("Invalid Otp.");
	            	System.out.println("Press \n1 to Renter \n2 to resend");
	            	int n2=sc.nextInt();
	            	String input=String.valueOf(n2);
	            	if(input.equals("1"))
	            	{
	            		System.out.print("Otp : ");
	                    String n3=sc.next();
	                    if(n3.equals(otp))
	                    {
	                    	b=true;
	                    	break;
	                    }
	            	}
	            	else
	            	{
	            		
	            	}
				}
			}
		}
		else
		{
			System.out.println("You dont have an account.\nPress\n1 to register, \nany key to exit.");
			String s=sc.next();
			if(s.equals("1"))
			{
				y.sigin();
			}
			else
			{
				System.out.println("Thank You");
			}
		}
		if(b==true)
		{
			System.out.print("Enter new Username : ");
			String u=sc.next();
			x.changeusername(u, num);
			System.out.println("Press\n1 to login,Any key to exit.");
			String input1=sc.next();
			if(input1.equals("1"))
			{
				log();
			}
			else
			{
				System.out.print("Thank  You.");
			}
		}
	}
	public void changepass() throws Exception
	{
		System.out.print("Enter your Mobile Number : ");
		String num=sc.next();
		boolean b=false;
		if(x.numbercheck(num))
		{
			while(true)
			{
				int n=x.otp();
				System.out.println("\nOtp sent.");
				System.out.print("OTP : ");
				String in=sc.next();
				String otp=String.valueOf(n);
				if(in.equals(otp))
				{
					b=true;
					break;
				}
				else
				{
					System.out.println("Invalid Otp.");
	            	System.out.println("Press \n1 to Renter \n2 to resend");
	            	int n2=sc.nextInt();
	            	String input=String.valueOf(n2);
	            	if(input.equals("1"))
	            	{
	            		System.out.print("Otp : ");
	                    String n3=sc.next();
	                    if(n3.equals(otp))
	                    {
	                    	b=true;
	                    	break;
	                    }
	            	}
	            	else
	            	{
	            		
	            	}
				}
			}
		}
		else
		{
			System.out.println("You dont have an account.\nPress\n1 to register, \nany key to exit.");
			String s=sc.next();
			if(s.equals("1"))
			{
				y.sigin();
			}
			else
			{
				System.out.println("Thank You");
			}
		}
		if(b==true)
		{
			System.out.print("Enter new Password : ");
			String p=sc.next();
			x.changepassword(p, num);
			System.out.println("Press\n1 to login,Any key to exit.");
			String input1=sc.next();
			if(input1.equals("1"))
			{
				log();
			}
			else
			{
				System.out.print("Thank  You.");
			}
		}
	}
}
