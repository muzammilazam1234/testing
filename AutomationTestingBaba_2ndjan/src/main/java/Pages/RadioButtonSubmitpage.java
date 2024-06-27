package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;


public class RadioButtonSubmitpage extends BaseLibrary {
	
	public RadioButtonSubmitpage() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[text()='×']")
	private WebElement Close;
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement Practice;
	@FindBy(xpath="//button[@data-target=\"#elements\"]")
	private WebElement Elements;
	@FindBy(xpath="//a[@href=\"#tab_3\"]")
	private WebElement RadioButtons;
	
	@FindBy (xpath="//input[@id=\"yes\"]")
	private WebElement yes;
	//@FindBy (xpath="//input[@value='impressive']")
	//private WebElement Impressive;
	//@FindBy (xpath="//input[@value='no']")
	//private WebElement No;
	@FindBy (xpath="//p[text()='You have selected yes']")
	private WebElement yesText;
	
	public void clickonClose()
	{
		Close.click();
	}
	public void clickonPractice()
	{
		Practice.click();
	}
	public void clickonElements()
	{
		Elements.click();
	}
	public void clickonRadioButtons()
	{
		RadioButtons.click();
	}

	public void clickonYes()
	{
		yes.click();
		String actual=yesText.getText();
		String expected = getReadData("yes");
		Assert.assertEquals(expected,actual);
		System.out.println("Both are Match");
	}
	
	/*public void clickonImpressive()
	{
		Impressive.click();
	}
	
	public void clickonNo() 
	{
		No.click();
	}*/
}
