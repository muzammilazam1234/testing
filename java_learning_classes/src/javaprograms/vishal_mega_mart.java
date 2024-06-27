package javaprograms;

import java.util.Scanner;

public class vishal_mega_mart 
{
	
	String name,productname;
	long mobileno;
	float ammount,gst,total;
	public void get()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the cx name");
		 name=sc.next();
		System.out.println("please enter the mobile no");
		 mobileno=sc.nextLong();
		System.out.println("please enter the product name");
		productname=sc.next();
		System.out.println("please enter the ammount");
         ammount=sc.nextFloat();	
	
         gst=(ammount*18)/100;
         
         total=(ammount+gst);
         
         System.out.println("***Welcome***");
         System.out.println("your name " +name);
         System.out.println("your are mobile no " +mobileno);
		 System.out.println("your product name _ " +productname);
		 System.out.println("product ammount "+ammount);
		System.out.println("Gst is "+gst);
		System.out.println("_____________________");
		System.out.println("total is "+total);
		System.out.println("_____________________");
		 
	}
	
	
	
	
	public static void main(String[] args) 
	{
		vishal_mega_mart ob = new vishal_mega_mart();
		ob.get();
	}

}
