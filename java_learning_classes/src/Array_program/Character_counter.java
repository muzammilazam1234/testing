package Array_program;

import java.util.Scanner;

public class Character_counter 
{
	public void countArray(String inp, char ch) 
	{
	char [] var=inp.toCharArray();
	int b=0;
	for(int i=0;i<=var.length-1; i++)
	
	{ if(var[i]==ch) {
		b++;
	}
	}
	System.out.println(b);
		
		
	}
	public static void main(String[] args) 
	{
		 Character_counter ob=new  Character_counter();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("please enter the any word ");
		 String word=sc.next();
		 System.out.println("please enter the any character ");
		 char ch=sc.next().charAt(0);
		 ob.countArray(word, ch);
	}
}
