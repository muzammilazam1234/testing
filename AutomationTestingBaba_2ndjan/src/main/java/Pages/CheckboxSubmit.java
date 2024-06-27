package Pages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class CheckboxSubmit extends BaseLibrary{

	public CheckboxSubmit()
	{
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//button[text()='×']")
	private WebElement Close;
	
	@FindBy(xpath="//a[@href='newdemo.html']")
	private WebElement Practice;
	
	@FindBy (xpath="//button[@data-target='#elements']")
	private WebElement Elements;
	
	@FindBy(xpath="//a[@href=\"#tab_2\"]")
	private WebElement Checkbox;
	
	@FindBy (xpath="//iframe[@src=\"Checkbox.html\"]")
	private WebElement Frame;
	
	@FindBy(xpath="//label[text()='Mobile:']")
	private WebElement MobileCheckbox;
	
	@FindBy(xpath="//input[@id='mylaptop']")
	private WebElement Laptopcheck;
	
	@FindBy (xpath="//input[@id='mydesktop']")
	private WebElement Desktopcheck;
	
	@FindBy (xpath="//h6[@id='text']")
	private WebElement Mobiletext;
	
	@FindBy(xpath="//h6[@id=\"text1\"]")
	private WebElement Laptoptext;
	
	@FindBy(xpath="//h6[@id='text2']")
	private WebElement Desktoptext;
	
	public void ClickonClose()
	{
		Close.click();
	}
	public void ClickonPractice()
	{
		Practice.click();
	}

	public void ClickonElement() 
	{
	   Elements.click();
	}
	
	public void Clickoncheckbox()
	{
		Checkbox.click();
	}
	
	public void clickonMobile()
	{
        driver.switchTo().frame(Frame);
		MobileCheckbox.click();
		String actual=Mobiletext.getText();
		String Expected = getReadData("mobile");
		Assert.assertEquals(Expected, actual);
		driver.switchTo().defaultContent();
		System.out.println("Successfull");
	}

	public void clkonLaptop()
    {
    	driver.switchTo().frame(Frame);
    	Laptopcheck.click();
    	String actual = Laptoptext.getText();
    	String Expected = getReadData("Laptop");
    	Assert.assertEquals(Expected, actual);
    	driver.switchTo().defaultContent();
    	System.out.println("Laptop validation Succesful");
    }
    public void clkonDesktop()
    {
    	driver.switchTo().frame(Frame);
    	Desktopcheck.click();
    	String actual = Desktoptext.getText();
    	String expected = getReadData("Desktop");
    	Assert.assertEquals(expected, actual);
    	driver.switchTo().defaultContent();
    	System.out.println("Desktop Validation Successful");
    }
}


