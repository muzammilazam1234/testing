package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.RadioButtonSubmitpage;
import baseLibrary.BaseLibrary;


public class RadioButtonTest extends BaseLibrary {

	RadioButtonSubmitpage ob;
	
	@BeforeTest
	public void LaunchURL()
	{
	launchUrl();
	ob=new RadioButtonSubmitpage();
}
	
	@Test(priority=1)
	public void clkonClose()
	{
		ob.clickonClose();
	}
	@Test(priority=2)
	public void clkonPractice()
	{
      ob.clickonPractice();
	}
	
	@Test(priority=3)
	public void clkonElement()
	{
		ob.clickonElements();
	}
	@Test(priority=4)
	public void clkonRadioButtons()
	{
		ob.clickonRadioButtons();
	}
	@Test(priority=5)
    public void clkonYes()
    {
    	ob.clickonYes();
    }

   /* public void clkonImpressive()
    {
    	ob.clickonImpressive();
    }
	
	public void clkonNo()
	{
	ob.clickonNo();	
	}*/
}
