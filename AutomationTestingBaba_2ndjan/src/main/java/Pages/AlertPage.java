package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;



public class AlertPage extends BaseLibrary{

	public AlertPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@data-target=\"#alerts\"]")
	private WebElement Alertsection;
	
	@FindBy(xpath="//a[text()='alerts']")
	private WebElement Alerttab;
	@FindBy(xpath="//button[@onclick=\"myalert()\"]")
	private WebElement Clickmetosee;
	@FindBy(xpath="//button[@onclick='aftersec5()']")
	private WebElement clkafterFive;
	@FindBy(xpath="//button[@onclick=\"myconfirm()\"]")
	private WebElement clktoconfirm;
	@FindBy(xpath="//button[@onclick=\"myprompt()\"]")
	private WebElement clktoperform;
	public void clkonAlertsection()
	{
		waitforClick(Alertsection);
	}
	public void clkonAlertTab()
	{
		waitforClick(Alerttab);
	}
	public void Clicktoalertnow() {
		waitforClick(Clickmetosee);
		driver.switchTo().alert().accept();
	}
	public void ClkAfterfive() throws InterruptedException
	{
		waitforVisibility(clkafterFive);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}
	public void clktoConfirm()
	{
		waitforClick(clktoconfirm);
		driver.switchTo().alert().accept();
		
	}
	public void clktoPerform()
	{
	 	waitforClick(clktoperform);
	 	driver.switchTo().alert().sendKeys("Neha");
	 	driver.switchTo().alert().accept();
	}
}
