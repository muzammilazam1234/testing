package javaprograms;

public class Additionaldem {
	
	int a,b,c;
	float d,e,f;
	public void add() {
	a=18;
	b=10;
	c=a+b;
	System.out.println(c);
	}
	public void sub() {
		a=20;
		b=7;
		c=a-b;
		System.out.println(c);
	}
	public void mult() {
		a=5;
		b=4;
		c=a*b;
		System.out.println(c);
	}
	public void div()
	
	{
	  d=18;
	  e=3;
	  f=d/e;
	  System.out.println(f);
	}
	
	
public static void main(String[] args) 
{
	Additionaldem obj= new Additionaldem();
	obj.add();
	obj.sub();
	obj.mult();
	obj.div();

	
}












}
