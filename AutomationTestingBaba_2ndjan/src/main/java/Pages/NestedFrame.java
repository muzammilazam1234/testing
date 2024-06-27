package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class NestedFrame extends BaseLibrary{

	public NestedFrame()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[@data-target=\"#alerts\"]")
	private WebElement ClkonFramewindow;
	
	@FindBy(xpath="//a[text()='nested frames']")
	private WebElement NestedFrames;

	@FindBy(xpath="//iframe[@src='target1.html']")
	private WebElement GrandParentFrame;
	@FindBy(xpath="//iframe[@src=\'text.html\']")
	private WebElement ParentFrame;

	@FindBy(xpath="//iframe[@src='example.html']")
	private WebElement ChildFrame;

	@FindBy(xpath="//a[@href='text1.html']")
	private WebElement childFrameText;
	
	public void FrameWindowclk()
	{
		waitforClick(ClkonFramewindow);
	}
	
	public void NestedFrameTabopen() {
		waitforClick(NestedFrames);
	}
	public void nestedFramesEntry()
	{
		driver.switchTo().frame(GrandParentFrame);
		driver.switchTo().frame(ParentFrame);
		driver.switchTo().frame(ChildFrame);
		waitforClick(childFrameText);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        System.out.println("Validation done");
	}
}
