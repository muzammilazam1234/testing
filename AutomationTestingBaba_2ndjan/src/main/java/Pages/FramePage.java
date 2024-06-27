package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baseLibrary.BaseLibrary;

public class FramePage extends BaseLibrary {

	public FramePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@data-target=\"#alerts\"]")
	private WebElement Framesec;
	
	@FindBy(xpath="//a[text()='frames']")
	private WebElement Frametab;
	
	@FindBy(xpath="//iframe[@style=\"height:200px;width:400px\"]")
	private WebElement ParentFrame;
	
	@FindBy(xpath="//iframe[@style=\"height:80px;width:120px\"]")
	private WebElement childFrame;
	
	@FindBy(xpath="//h1[text()='This `is a sample page'][1]")
	private WebElement ParentFrameText;
	
	@FindBy(xpath="(/html/body/h1)[1]")
	private WebElement childFrameText;
	
	public void FrameSecClk()
	{
		waitforClick(Framesec);
	}
	public void FrameTabClk()
	{
		waitforClick(Frametab);
	}
	
	public void ParentFrame()
	{
		SoftAssert asse = new SoftAssert();
	  driver.switchTo().frame(ParentFrame);
	  String Actual=ParentFrameText.getText();
	  driver.switchTo().defaultContent();
	  System.out.println(Actual);
	  asse.assertAll();
	  	  }
	
	public void childFrame()
	{
		SoftAssert asse = new SoftAssert();
		driver.switchTo().frame(childFrame);
		String Actual = childFrameText.getText();
		System.out.println(Actual);
		driver.switchTo().defaultContent();
		asse.assertAll();
	}
}


