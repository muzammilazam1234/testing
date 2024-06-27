package javaprograms;

public class String_Array_Demo 
{
	public void stringDemo()
	{
		String[] name = {"muzammil","azam","saifi","khan","hayat"};
		for (int i=name.length-1; i>=0; i--)
		
		System.out.println(name[i]);
		
		System.out.println("size of the name " + name.length);
	}

	public static void main(String[] args) {
		String_Array_Demo ob = new String_Array_Demo();
		ob.stringDemo();
	}
}
