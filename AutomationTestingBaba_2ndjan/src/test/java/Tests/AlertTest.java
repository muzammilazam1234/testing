package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.AlertPage;
import baseLibrary.BaseLibrary;


public class AlertTest extends BaseLibrary {

	AlertPage ob;

	@BeforeTest
	public void LaunchUrl()
	{
		launchUrl();
		ob=new AlertPage();
	}
	
	@Test(priority=1)
	public void clkAlertSec()
	{
		ob.clkonAlertsection();
	}
	@Test(priority=2)
	public void clkAlertTab()
	{
	ob.clkonAlertTab();	
	}
	@Test(priority=3)
   public void clkAlertNow()
   {
	ob.Clicktoalertnow();   
   }
	@Test(priority=4)
   public void ClickAfterfive() throws InterruptedException
   {
	   ob.ClkAfterfive();
   }
	@Test(priority=5)
 public void ClicktoConfirm()
 {
	 ob.clktoConfirm();
 }
	@Test(priority=6)
 public void ClicktoPerform()
 {
	 ob.clktoPerform();
 }
}
