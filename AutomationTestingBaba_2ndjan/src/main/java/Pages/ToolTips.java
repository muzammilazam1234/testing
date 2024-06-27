package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baseLibrary.BaseLibrary;


public class ToolTips extends BaseLibrary{

	public ToolTips()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@data-target='#widget']")
	private WebElement WidgetClk;
	
	@FindBy(xpath="//a[@href='#tab_22']")
	private WebElement Tooltips;
	
	@FindBy(xpath="//button[@title=\'you hovered over the button\']")
     private WebElement HoverMe;
	
	public void clkonWidget()
	{
		waitforClick(WidgetClk);
	}
    public void clkonToolTips()
    
   {
    	waitforClick(Tooltips);
   }
    public void GetValidateHoverme()
    {
       mouseOver(HoverMe);
       String actual = HoverMe.getAttribute("title");//title is object attribute here
       String Expected = getReadData("title");
       SoftAssert asse = new SoftAssert();
       asse.assertEquals(actual, Expected);
       asse.assertAll();
       System.out.println("Validation Done");
    }

}
