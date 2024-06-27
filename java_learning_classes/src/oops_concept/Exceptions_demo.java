package oops_concept;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions_demo {
	
	
	
	
		public void getdata()
		{
			System.out.println("please enter the data");
		}
		public void showdata()
		{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the two no");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ex)
		{
			ex.printStackTrace();
			showdata();
		}
		catch (InputMismatchException e) {
			e.printStackTrace();
			hellodata();
		}
		}
		public void hellodata()
		{
			System.out.println("please fill the data");
		}
		public static void main(String[] args) {
			Exceptions_demo ob = new Exceptions_demo();
		
			ob.showdata();

		}
	
}
