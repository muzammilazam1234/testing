package javaprograms;
import java.util.Scanner;
public class calculater
{
	
	public void get()
	{
		Scanner sc= new Scanner(System.in);
		
		for(int c = 1; c>=10; c++ ) 
		{	
		System.out.println("please enter the first value");
		int a=sc.nextInt();
		System.out.println("please enter oprations");
		char c1=sc.next().charAt(0);
		System.out.println("please enter the second value");
		int b=sc.nextInt();
		
		if(c1=='+')
		{
			System.out.println(a+b);
		}
		
		else if (c1=='-')
		{
			System.out.println(a-b);
		}
		
		
		else if (c1=='*')
		{
			System.out.println(a*b);
		}
		
		else if (c1=='/')
		{
			System.out.println(a/b);
		}
		
		else
		{
			System.out.println("error");
		}
	
		
	}}
	
	
	public static void main(String[] args) {
		calculater ob = new calculater();
		
		ob.get();
	}

}
