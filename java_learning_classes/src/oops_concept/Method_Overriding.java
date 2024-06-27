package oops_concept;

import java.util.Scanner;

class MarksInPercentage
{
	public void getPercantage(int marks)
	{
		System.out.println((marks*100)/500);;
	}
}
	
class NewMarksInPercentage extends MarksInPercentage
{
	public void getPercantage(int marks)
	{   //super.getPercantage(marks);
		System.out.println((marks*100)/500);;
	}
}
		

public class Method_Overriding
{ 

	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.println("please enter the marks");
		int marks=sc.nextInt();
		Method_Overriding ob=new Method_Overriding();
		MarksInPercentage ob1=new NewMarksInPercentage();
		ob1.getPercantage(marks);
		
		
				
	
	}
}
