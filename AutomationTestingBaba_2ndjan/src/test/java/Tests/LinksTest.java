package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LinksPage;
import baseLibrary.BaseLibrary;


public class LinksTest extends BaseLibrary{
	
	LinksPage ob;
	
@BeforeTest	
public void launchurl()
{
launchUrl();
ob = new LinksPage();
}
@Test(priority=1)
public void Elements()
{
ob.element();	
}
@Test(priority=2)
public void Links()
{
	ob.Links();
 }
@Test(priority=3)
public void Demopage()  throws InterruptedException
{
	ob.demopage();
	}

}
