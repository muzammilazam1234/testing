package javaprograms;

import java.util.Scanner;

public class SamUniversity 
{
	public float getMarks(float marks)
	{
		
	float sam=0;
		if(marks<33)
		{
			System.out.println("total marks ="  + (marks+5));
		}
		else if (marks >=33&marks<50)
		{
			System.out.println("total marks ="  + (marks*5));
		}
		else if ( marks >=50 & marks<100)
		{
			float mark = marks;
			float reminder = mark%2;
			if(reminder==0)
			{
				System.out.println("reminder is even ="  + (marks/2));
			}
			else
			{
				System.out.println("reminder is odd ="   + marks);
			}
			
		}
		else
		{
			System.out.println("avobe the max. marks so its no is not valid");
		}
		return sam;
	}
	
	public static void main(String[] args) 
	{ 
		SamUniversity ob = new SamUniversity();
	    Scanner sc = new Scanner(System.in);
	    System.out.println("please enter the marks");
	    float marks = sc.nextFloat();
		float reminder =ob.getMarks(marks);
	
	
		
	}
}
