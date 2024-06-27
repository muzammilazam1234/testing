package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.SelectDropdown;
import baseLibrary.BaseLibrary;


public class SelectDropDownTest extends BaseLibrary {

	SelectDropdown ob;
	
	@BeforeTest
	public void launchURL() throws InterruptedException
	{
		Thread.sleep(5000);
		launchUrl();
		ob=new SelectDropdown();
	}
	
	@Test(priority=1)
	public void WidgetMenuClk() throws InterruptedException
	{
		ob.Clkonwidgets();
	}
	@Test(priority=2)
	public void selectMenuClk()
	{
	  ob.ClkonSelectMenu();
	}
	@Test(priority=3)
	public void selectvalueClk()
	{
		ob.selectValue();
	}

	@Test(priority=4)
	public void selectbyOne()
	{
    	ob.selectOne();	
	}
	@Test(priority=5)
	
		public void selectOldMenu()
	{
		ob.oldSelectMenu();
	}
	@Test(priority=6)
	public void MultiSelect()
	{
		ob.multiSelect();
	}
}
