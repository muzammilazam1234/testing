package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ButtonsSubmitPage;
import baseLibrary.BaseLibrary;


public class ButtonsTestPage extends BaseLibrary{

	ButtonsSubmitPage ob;
	
    @BeforeTest()
	public void launchurl()
	{
		launchUrl();
		ob=new ButtonsSubmitPage();
	}
    
    @Test(priority=1)
	public void ClkonElement()	
	{
        ob.ClickonElement();
	}
	@Test(priority=2)
	public void clkonButtons()
	{
	  ob.clickonButtons();
	}
	@Test(priority=3)
	public void doubleClk()
	{
	ob.doubleClickme();
	}
	@Test(priority=4)
	public void rightClk()
	{
		ob.rightClick();
	}
	@Test(priority=5)
	public void ClkMe()
	{
		ob.ClickMe();
	}
	}
