package oops_concept;

public class Static_block_demo 
{
    static
    {
    	System.out.println("what is your name");
    }
	
	
	public  Static_block_demo()
	{
		System.out.println("my name is muzammil");
	}
	
	
	
	public static void main(String[] args) 
	{
		Static_block_demo ob = new Static_block_demo();
	}
}
