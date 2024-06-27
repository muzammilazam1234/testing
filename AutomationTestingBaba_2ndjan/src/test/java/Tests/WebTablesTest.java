package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.TextboxSubmitPage;
import Pages.WebTablesSubmit;
import baseLibrary.BaseLibrary;

public class WebTablesTest extends BaseLibrary{

	WebTablesSubmit ob;
	@BeforeTest
	public void launchURL() throws InterruptedException 
	{	
		launchUrl();
		ob = new WebTablesSubmit();
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
	public void clkonWebTables()
	{
		ob.clickonWebTables();
	}
	@Test(priority=5)
	public void filldata()
	{
		ob.filldetails();
	}
	@Test(priority=6)
	public void updateTabledata()
	{
		ob.updateTable();
	}
	@Test(priority=7)
	public void getValidateTable()
	{
		ob.getValidate();
	}
}
