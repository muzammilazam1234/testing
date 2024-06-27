package javaprograms;

import java.util.Scanner;
public class Table_demo 
{
	
	public void getTable(int num)
	{
	for(int i=1; i<=10; i++)
	{
	System.out.println(i*num);
		
	}
	
	}
	public static void main(String[] args) {
		Table_demo ob=new  Table_demo ();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("please enter the number of the table");
		int num=sc.nextInt();
		 ob.getTable(num);
	}
}
