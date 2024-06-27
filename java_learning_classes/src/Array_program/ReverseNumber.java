package Array_program;

import java.util.Scanner;

public class ReverseNumber 
{ 	
	public static void reverseNum(String inp)
	{
	
		String out="";
				
		for(int i=0;i<inp.length();i++)
		{
			

			char ch = inp.charAt(i);
			
			

			if(out.indexOf(ch)<0)
			{
				out=out+ch;
				
			}
			
			
			
			
		}
		System.out.println(out);
		
	
	}
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("please enter the number ");
		String inp = sc.next();
		reverseNum(inp);
		
	}
	
	
	
	
	
}
