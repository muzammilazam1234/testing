package oops_concept;
 final class A
{   
	final public void getData ()
	{	
		System.out.println("hello");
	}
}
public class FinalKeyword_Demo extends A 
{
	 
public void getData ()
{
	System.out.println("hyy");
}
	
	public static void main(String[] args) {
		FinalKeyword_Demo ob = new FinalKeyword_Demo();
		ob.getData();
	}
}
