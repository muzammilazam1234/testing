package javaprograms;

import java.util.Scanner;

public class table 
{

	public void getTable(float input)
	{
		for(float i=10; i>=1; i--)
		{
		
			System.out.println(input*i);
		}
	}
	public static void main(String[] args)
	{
		table ob = new table();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number of the table");
		float table = sc.nextFloat();
		ob.getTable(table);
	}
}
