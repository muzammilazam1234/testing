package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CheckboxSubmit;
import baseLibrary.BaseLibrary;


public class CheckboxTest extends BaseLibrary{
	
	CheckboxSubmit ob;
	
	@BeforeTest
	public void launchurl()
	{
		launchUrl();
		ob=new CheckboxSubmit();
	}

	@Test(priority=1)
	public void clkonclose()
	{
		ob.ClickonClose();
	}
	@Test(priority=2)
	public void clkonpractice()
	{
		ob.ClickonPractice();
	}
	@Test(priority=3)
	public void clkonelement()
	{
		ob.ClickonElement();
	}
	@Test(priority=4)
	public void clkoncheckbox()
	{
		ob.Clickoncheckbox();
	}
	
	@Test(priority=5)
    public void mobileclk()
    {
    	ob.clickonMobile();
    }
    @Test(priority=6)
	public void Laptopclk()
	{
		ob.clkonLaptop();
	}
	@Test(priority=7)
	public void DesktopClk()
	{
		ob.clkonDesktop();
	}
}
