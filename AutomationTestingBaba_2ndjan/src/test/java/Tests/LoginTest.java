package Tests;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.LoginPage;
import baseLibrary.BaseLibrary;




public class LoginTest extends BaseLibrary {
	
	LoginPage ob;
	
	@BeforeTest
	public void launchURL() 
	{	
		launchUrl();
		ob = new LoginPage();
	
	}
	
	@Test 
	public void clickonCLose()	
	{
    ob.clickonClose();
	}
   
	@Test
	public void clickonpractice()
	{
		ob.Practiceclick();
	}
	@Test 
	public void GetUrll()
	{
		ob.geturl();
	}
	
	@Test(enabled=false)
  public void GetTitle() {
	  ob.gettitle();
  }
    }
