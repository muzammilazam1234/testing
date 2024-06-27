package javaprograms;

public class ArrayDemo 
{
	public void getNum()
	{
		int[] arry = {1,2,3,4,5,5,6,7,8,9};
		
		for (int i=0;i<=arry.length-1; i++)
		{
			System.out.println(arry[i]);
		}
		System.out.println("size of the aray"  +arry.length);
	}
    public static void main(String[] args) {
    	ArrayDemo ob=new ArrayDemo();
    	ob.getNum();
	}
}
 