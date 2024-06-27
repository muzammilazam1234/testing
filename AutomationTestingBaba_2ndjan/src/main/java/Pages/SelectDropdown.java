package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class SelectDropdown extends BaseLibrary{

	public SelectDropdown()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[@data-target='#widget']")
	private WebElement Widgets;
	
	@FindBy (xpath="//a[@href='#tab_24']")
	private WebElement SelectMenu;
	
	@FindBy(xpath="((//select[@class=\"form-control\"])[2]")
	private WebElement SelectValue;
	
	@FindBy (xpath="(//select[@class=\"form-control\"])[3]")
	private WebElement SelectOne;
	
	@FindBy (xpath="(//select)[4]")
	private WebElement OldSelect;
	
	@FindBy(xpath="(//select[@multiple=\"multiple\"])[2]")
	private WebElement SelectMultiple;
	
	public void Clkonwidgets() throws InterruptedException
	{
		Thread.sleep(5000);
		waitforClick(Widgets);
	}
	public void ClkonSelectMenu()
	{
		waitforClick(SelectMenu);
	}
	public void selectValue()
	{
		selectbyvisibletext(SelectValue,"Group 1, Option 2");
	}
	public void selectOne()
	{
		selectByIndex(SelectOne, 1);
	}
   public void oldSelectMenu()
   {
	   selectbyvisibletext(OldSelect,"Group 1, Option 2");   
   }
  public void multiSelect()
  {
	  selectByIndex(SelectMultiple, 2);
  }
}
