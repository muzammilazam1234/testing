package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ToolTips;
import baseLibrary.BaseLibrary;


public class ToolTipsTest extends BaseLibrary {

	ToolTips ob;
	@BeforeTest
	public void launchurl()
	{
		launchUrl();
		ob=new ToolTips();
	}
	
	@Test(priority=1)
	 public void widgetClk()
	 {
		ob.clkonWidget();
			 }

	@Test(priority=2)
 public void ToolTipsClk()
 {
	ob.clkonToolTips();
	}
	@Test(priority=3)
  public void HovermeValidation()
  {
	  ob.GetValidateHoverme();
  }
}
