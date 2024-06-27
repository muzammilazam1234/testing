package Pages;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baseLibrary.BaseLibrary;



public class ButtonsSubmitPage extends BaseLibrary{

	public ButtonsSubmitPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement Close;
	@FindBy(xpath = "//a[text()='Practice']")
    private WebElement Practice;
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement Elements;
	@FindBy (xpath="//a[text()='buttons']")
	private WebElement Buttons;
	@FindBy(xpath="//button[@ondblclick=\"doubletext()\"]")
	private WebElement DoubleClick;
	@FindBy(xpath="//button[@oncontextmenu=\"righttext()\"]")
	private WebElement RightClick;
	@FindBy(xpath="//button[@onclick=\"clicktext()\"]")
	private WebElement Clickme;
//xpath for actual webelement
	@FindBy(xpath="//p[@id=\"double-content\"]")
private WebElement doubleclkText;
	@FindBy(xpath="//p[@id=\"right-content\"]")
			private WebElement rightClkText;
	@FindBy (xpath="//p[@id=\"click-content\"]")
			private WebElement clickmeText;
	
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
	public void clickonButtons()
	{
		 Buttons.click();
	}
	
	public void doubleClickme()
	{
		SoftAssert asse = new SoftAssert();
		doubleClick(DoubleClick);
        String actual = doubleclkText.getText();
        String Expected= getReadData("DoubleClickMe");
        asse.assertEquals(actual, Expected);
        System.out.println("Double Click Validation Done");
        asse.assertAll();	
	}
	public void rightClick()
	{
		SoftAssert asse = new SoftAssert();
		rightClick(RightClick);
		String actual = rightClkText.getText();
		String Expected = getReadData("RightClickMe");
		asse.assertEquals(actual, Expected);
		System.out.println("Right Click Validation done");
		asse.assertAll();
	}
	public void ClickMe()
	{
		SoftAssert asse = new SoftAssert();
		singleClick(Clickme);
		String actual = clickmeText.getText();
		String Expected = getReadData("ClickMe");
		asse.assertEquals(actual, Expected);
		System.out.println("Single Click Validation done");
		asse.assertAll();
	}
}

