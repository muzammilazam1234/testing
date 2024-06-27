	package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.TextboxSubmitPage;
import baseLibrary.BaseLibrary;


public class TextboxTest extends BaseLibrary{

	
	TextboxSubmitPage ob;
	
	@BeforeTest
	public void launchURL() throws InterruptedException 
	{	
		launchUrl();
		ob = new TextboxSubmitPage();
		}
	
	@Test(priority=1)
	public void ClkonClose()	
	{
    ob.ClickonClose();
	}
	
	@Test(priority=2)
	public void ClkonPractice()	
	{
     ob.ClickonPractice();
     }
	
	@Test(priority=3)
	public void ClkonElement()	
	{
        ob.ClickonElement();
	}
	
	@Test(priority=4)
	public void TextboxClick()	
	{
    ob.ClickonTextbox();
	}
 
	@Test(priority=5)
	public void FillDetails()
	{
		ob.filldetails();
	}

	@Test(priority=6)
	public void validateDetails()
	{
		ob.getValidateDetails();
	}
}
