package javaprograms;

import java.util.Scanner;

public class Uber_ride 
{  
	public void getUberAmmount(float distance, String month)
	{
		
		if (month.equals("june")||month.equals("july"))
		{
			System.out.println("Total Payable Ammount" +  distance*7);
		}
		else {
			if(distance<100) {
				System.out.println("Total Payable Ammount" +  distance*6);
			}
			else if (distance>=100&distance<=300)
			{
				System.out.println("Total Payable Ammount" +  distance*5);
			}
			
			else 
			{
				System.out.println("Total Payable Ammount" +  distance*4);
			}
		}

	
	}
	
public static void main(String[] args) {
	Uber_ride ob=new Uber_ride();
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the distance");
	float km=sc.nextInt();
	System.out.println("please enter the month");
	String month=sc.next();
    ob.getUberAmmount(km, month);

	
	
}
}
