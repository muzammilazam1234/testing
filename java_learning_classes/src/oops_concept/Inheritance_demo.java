package oops_concept;

class Cat 
{	
    public void allCat() 
   {
	System.out.println("please enter the pet cat");
	}

}

 class dog extends Cat
 {
	 public void allDog()
	 {
		 System.out.println("please enter the name");
	 }
	 
 }
    public class Inheritance_demo extends dog 
    {
    public void cow ()
    {
    	System.out.println("please enter the name ");
    }
 
{ 
	Inheritance_demo ob = new Inheritance_demo();
    System.out.println("please enter the name");
    ob.allCat();
    ob.allDog();
    ob.cow();

}	
}
