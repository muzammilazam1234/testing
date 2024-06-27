package javaprograms;
import java.util.Scanner;
public class Marksheet
{	
	public float getResult(String name, String fathername, String mothername, String collegename, String course, int rollno, int hindi ,int science, int english, int math, int computer, int totalmarks, int obtainedmarks )
	{
		int obtainedMarks = (hindi+english+science+math+computer);
		float percentage = (obtainedMarks/100)/totalmarks;
	   
	    System.out.println(" Student name "   +name);
	    System.out.println("father name   "   +fathername);
	    System.out.println("mother name   "   +mothername);
	    System.out.println("college name  "   +collegename);
	    System.out.println("course        "   +course);
	    System.out.println("roll no       "   +rollno);
	    System.out.println("science mark  "   +hindi);
	    System.out.println("Hindi mark    "   +science);
	    System.out.println("English mark  "   +english);
	    System.out.println("Math mark     "   +math);
	    System.out.println("Computer mark "   +computer);
	    
	    if (hindi<33|english<33|math<33|science<33|computer<33) 
	    {
		
	    	System.out.println("student is Fail");
		} 
	    
	    else if (percentage>=33&percentage<45)
	    {
	    	System.out.println("divison   third ");
	    }
	    
	    else if (percentage>=45&percentage<60)
	    {
	    	System.out.println("divison   second ");
	    }
	    
	    else 
	    {
	    	System.out.println("divison   first ");
	    }
        return percentage;	
	}
	public static void main(String[] args) 
	{
		Marksheet ob=new Marksheet();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the name");
		String name=sc.nextLine();
		System.out.println("please enter the father name");
		String fathername=sc.nextLine();
		System.out.println("please enter the mother name");
		String mothername=sc.nextLine();
		System.out.println("please enter the college name");
		String collegename=sc.nextLine();
		System.out.println("please enter the course");
		String course=sc.next();
		System.out.println("please enter the roll no");
		int rollno=sc.nextInt();
		System.out.println("please enter the mark of science");
		int science=sc.nextInt();
		System.out.println("please enter the mark of hindi");
		int hindi=sc.nextInt();
		System.out.println("please enter the mark of english");
		int english=sc.nextInt();
		System.out.println("please enter the mark of math");
		int math=sc.nextInt();
		System.out.println("please enter the mark of computer");
		int computer=sc.nextInt();
		System.out.println("please enter the total marks ");
		int totalmarks=sc.nextInt();
		ob.getResult(name, fathername, mothername, collegename, course, rollno, hindi, science, english, math, computer, totalmarks, totalmarks);
		
		
		
	}
}
