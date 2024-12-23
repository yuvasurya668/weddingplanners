package wedding;
import java.util.*;
public class register {
	static Scanner sc=new Scanner(System.in);
	static jdbc x=new jdbc();
	static login y=new login();
	private String username;
	private String number;
	private String password;
	public void setname(String name){
        this.username=name;
    }
	public void setpass(String pass){
        this.password=pass;
    }
	public void setnum(String num){
        this.number=num;
    }
	public String getname(){
        return username;
    }
	public String getpass(){
        return password;
    }
	public String getnum(){
        return number;
    }
    public void sigin() throws Exception
    {
    	System.out.print("username : ");
    	String name=sc.next();
        setname(name);
        while(true)
        {
        	System.out.print("password : ");
            String pass=sc.next();
            if(pass.length()>6) 
            {
            	setpass(pass);
            	break;
            }
            else
            {
            	System.out.println("Password must contain atleast 7 characters.");
            }
        }
        while(true)
        {
        	System.out.print("Mobile number : ");
            String num=sc.next();
            if(num.length()==10)
            {
            	int count=0;
            	for(int i=0;i<num.length();i++)
            	{
            		if(num.charAt(i)>='0' && num.charAt(i)<='9')
            		{
            			count++;
            		}
            	}
            	if(count==10)
            	{
            		setnum(num);
            		break;
            	}
            	else
            	{
            		System.out.println("Mobile number should consists of only numbers");
            	}
            }
            else
            {
            	System.out.println("Mobile number must contain 10 digits.");
            }
        }
        while(true)
        {
        	int n=x.otp();
        	String otp=String.valueOf(n);
            System.out.println("OTP Sent");
            System.out.println(n);
            System.out.print("Otp : ");
            String n1=sc.next();
            if(otp.equals(n1))
            {
            	System.out.println("Registration Sucessful.");
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
                    	System.out.println("Registration Sucessful.");
                    	break;
                    }
            	}
            	else
            	{
            		
            	}
            }
        }
        String u=getname();
        String n=getnum();
        String p=getpass();
        x.insertion(u, p, n);
        System.out.println("press \n1 to login, \nAny key to exit.");
        String in=sc.next();
    	if(in.equals("1"))
    	{
    		y.log();
    	}
    	else
    	{
    		System.out.println("Thank You");
    	}
    }
}
