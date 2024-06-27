package oops_concept;

class Planet
{
	public void planetName  () 
	{
	System.out.println("please enter the planet name ");	
	}
}
class Earth extends Planet
{
	public void earthThing()
	{
		System.out.println("please enter the name of earth things");
	}
}
class C extends Planet
{
	public void methodC()
	{
		System.out.println(" please enter the name of c");
	}
}
class D extends C
{
	public void MethodD()
	{
		System.out.println(" plese enter the name of c");
		
	}
}

public class Heirerical_Hybrid {
	public static void main(String[] args) {
		
	
	Heirerical_Hybrid ob = new Heirerical_Hybrid();
	Earth ob1 = new Earth();
	D ob2 = new D();
	ob1.earthThing();
	ob2.methodC();
	ob2.MethodD();
	ob2.planetName();
	
	
	}
}
