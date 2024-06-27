package javaprograms;

import java.util.Scanner;

public class Reverse_string 
{
	    public void reverseString(String inp)
	    { 
	    
	    	char[] arr=inp.toCharArray();
	    	String rev="";
	    	for(int i=arr.length-1; i>=0; i-- )
	    	{
	    		rev = rev+arr[i];
	    	}
	    	System.out.println(rev);
	    	
	    }
		public static void main(String[] args) {
		Reverse_string ob = new Reverse_string();
		 Scanner sc=new Scanner(System.in);
		System.out.println("please enter the input");
		String name=sc.nextLine();
		ob.reverseString(name);
	}
}
