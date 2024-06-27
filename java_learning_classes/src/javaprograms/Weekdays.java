package javaprograms;

import java.util.Scanner;

public class Weekdays 
{
	public void getdays(String daysname)
	{
		if (daysname.equals("sunday"))
		{
			System.out.println("sunday is holiday");
		}
		else if (daysname.equals("monday"))
		{
			System.out.println("sunday is firstday of week");
		}
		
		else if (daysname.equals("tuesday"))
		{
			System.out.println("sunday is second day of week");
		}
		
		else if (daysname.equals("wednesday"))
		{
			System.out.println("sunday is third day of week");
		}
		
		else if (daysname.equals("thursday"))
		{
			System.out.println("sunday is forth day of week");
		}
		
		else if (daysname.equals("friday"))
		{
			System.out.println("sunday is fifth day of week");
		}
		
		else if (daysname.equals("saturday"))
		{
			System.out.println("sunday is sixth day of week");
		}
		
		else
		{
			System.out.println("day name is wrong");
		}
	}

	public static void main(String[] args) {
		
		Weekdays ob = new Weekdays();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the day");
		String days = sc.next();
		ob.getdays(days);
	}
}
