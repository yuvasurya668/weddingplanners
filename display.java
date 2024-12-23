package wedding;
import java.util.*;
public class display 
{
	static String s;
	static {
		System.out.println("Welcome to the Wedding Planners.\n");
	}
    static Scanner sc=new Scanner(System.in);
    public void display1()
    {
        System.out.println("Here are some plans.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("We have 3 plans you can choose any one");
        System.out.println("=============================================================");
        System.out.println("1-Basic plan. \nCost - 100000/-");
        System.out.println("=============================================================");
        System.out.println("2-Premium plan. \nCost - 200000/-");
        System.out.println("=============================================================");
        System.out.println("3-Ultra Premium plan. \nCost - 300000/-");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Press \n1 for Basic plan. \n2 for Premium plan. \n3 for Ultra Premium plan.");
        System.out.print("Please select your plan : ");
        s=sc.next();
        if(s.equals("1"))
        {
            System.out.println("You have selected Basic Plan.");
            System.out.printf("%60s%n","Here is your plan details. \n");
            System.out.printf("%30s%n","-->FOOD \n");
            System.out.printf("%10s%n","--> Snacks\n");
            System.out.println("* Golgoppa \n* Panipuri \n* Gobi \n* Samosa \n");
            System.out.printf("%10s%n","--> Dinner \n");
            System.out.println("* Veg pulav \n* Veg curries \n* White rice \n* Sweet \n* Chips \n* Watter bottle \n");
            System.out.printf("%30s%n","--> HALL \n");
            System.out.println("* NON AC Hall \n* Photography \n* Videography \n* Flower desgin \n* Lighting \n");
            System.out.printf("%30s%n","--> Accomodation \n");
            System.out.println("* 10 Rooms for Guests \n");
            finishing();
        }
        else if(s.equals("2"))
        {
            System.out.println("You have selected Premium Plan.");
            System.out.printf("%60s%n","Here is your plan details. \n");
            System.out.printf("%30s%n","-->FOOD \n");
            System.out.printf("%10s%n","--> Snacks\n");
            System.out.println("* Golgoppa \n* Panipuri \n* Gobi \n* Samosa \n* Mixture \n* Veg momos \n* Boiled Groundnuts \n* Noodles \n");
            System.out.printf("%10s%n","--> Salads \n");
            System.out.println("* Fruit Salad \n* Vegetable Salad \n");
            System.out.printf("%10s%n","--> Dinner \n");
            System.out.println("* Veg pulav \n* Veg curries \n* White rice \n* Sweet \n* Chips \n* Watter bottle \n* Fries \n* Paneer curry \n* Roti/Naan \n* Colour Rice/Lemon Rice \n* Gobi Rice \n");
            System.out.printf("%30s%n","--> HALL \n");
            System.out.println("* AC Hall \n* Photography \n* Videography \n* 2 Drones for Videography \n* Flower desgin \n* Lighting \n* Crackers \n* Smoke effect \n* Sangeeth \n");
            System.out.printf("%30s%n","--> Accomodation \n");
            System.out.println("* 15 Rooms for Guests \n");
            System.out.printf("%30s%n","--> Makeup \n");
            System.out.println("* Facial \n* Makeup for Bride and Groom \n* Hair cut");
            finishing();
        }
        else if(s.equals("3"))
        {
            System.out.println("You have selected Ultra Premium Plan.");
            System.out.printf("%60s%n","Here is your plan details. \n");
            System.out.printf("%30s%n","-->FOOD \n");
            System.out.printf("%10s%n","--> Snacks\n");
            System.out.println("* Golgoppa \n* Panipuri \n* Gobi \n* Samosa \n* Mixture \n* Veg momos \n* Boiled Groundnuts \n* Noodles \n* Bhel puri \n* Shawarmas \n");
            System.out.printf("%10s%n","--> Salads \n");
            System.out.println("* Fruit Salad \n* Vegetable Salad \n");
            System.out.printf("%30s%n","--> Icecream \n");
            System.out.println("* BuuterScotch \n* Vennila \n* Strawberry \n* MilkShakes \n* Cooldrinks \n");
            System.out.printf("%30s%n","--> Mocktails \n");
            System.out.println("* All types \n");
            System.out.printf("%10s%n","--> Dinner \n");
            System.out.println("* Veg pulav \n* Veg curries \n* White rice \n* Sweet \n* Chips \n* Watter bottle \n* Fries \n* Paneer curry \n* Roti/Naan \n* Colour Rice/Lemon Rice \n* Gobi Rice \n");
            System.out.printf("%30s%n","--> HALL \n");
            System.out.println("* Centralized AC Hall \n* Photography \n* Videography \n* 4 Drones for Videography \n* LED Screens in allover Function hall \n* Flower desgin \n* Lighting \n* Crackers \n* Smoke effect \n* Sangeeth \n* Paneer tikka \n* Gobi fry \n* Gobi Rice \n");
            System.out.printf("%30s%n","--> Accomodation \n");
            System.out.println("* 20 Rooms for Guests \n");
            System.out.printf("%30s%n","--> Makeup \n");
            System.out.println("* Facial \n* Makeup for Bride and Groom \n* Hair cut \n* Costumes \n* Rose water \n* Spa \n");
            finishing();
        }
        else
        {
            System.out.print("You have selected Invalid Plan. \nPress 1 to reselect the plans or any key to exit : ");
            char b=sc.next().charAt(0);
            if(b=='1')
            {
                display1();
            }
            else
            {
                System.out.println("Thank You.");
            }
        }
    }
    public void finishing()
    {
    	if(s.equals("1"))
    	{
    		System.out.println("\nYou have selected the Basic plan.\nThank You for consulting us.");
    	}
    	else if(s.equals("2"))
    	{
    		System.out.println("\nYou have selected the Premium plan.\nThank You for consulting us.");
    	}
    	else if(s.equals("3"))
    	{
    		System.out.println("\nYou have selected the Ultra Premium plan.\nThank You for consulting us.");
    	}
    	
    }
}