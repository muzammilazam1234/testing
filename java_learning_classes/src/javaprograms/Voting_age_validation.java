package javaprograms;

import java.util.Scanner;

public class Voting_age_validation 
{
     public void getAgeValidation(int age) 
     {
    
    	 if(age<18)
    	 {
    		 System.out.println(age+"is not eligible");
    	 }
    	 else if(age>=18&age<=60)
    	 {
    		 System.out.println(age+"is eligible");
    	 }
    	 else {
    		 System.out.println(age+"is retired");
    	 }
     
     }
	public static void main(String[] args) 
{
	Voting_age_validation ob=new Voting_age_validation();
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the age");
	int age=sc.nextInt();
	ob.getAgeValidation(age);
	
	
	
	
	}
}