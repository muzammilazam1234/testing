package Array_program;

import java.util.Scanner ;
public class Array_pallindrom 
{	public void arrayPallindrom(String input )
	{
	 char [] c=input.toCharArray();
	 int size=c.length;
	 String out="";
	 for(int k=size-1;k>=0;k--)
	 {
		   out =out+c[k];
		  
	 } 
		  System.out.println(out);
	
		   if(input.equals(out)) {
			   System.out.println("is a pallindrom");
		   }
		   else {
			   System.out.println("is not a pallindrom");
		   }
		   
	}
	public static void main(String[] args) 
	{
		Array_pallindrom ob= new Array_pallindrom();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the input");
		String input=sc.next();
		ob.arrayPallindrom(input);
		
		    
	}

}
