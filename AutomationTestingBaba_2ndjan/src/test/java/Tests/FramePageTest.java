package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.FramePage;
import baseLibrary.BaseLibrary;


public class FramePageTest extends BaseLibrary {
	
	FramePage ob;
	
	@BeforeTest
	public void LaunchUrl()
	{
		launchUrl();
		ob=new FramePage();
	}
@Test(priority=1)
public void Framesecclk() {
	ob.FrameSecClk();
}
@Test(priority=2)
public void Frametabclk()
{
	ob.FrameTabClk();
	}
@Test(priority=3)
public void parentFrame()
{
ob.ParentFrame();
	}
  
@Test(priority=4)
public void ChildFrame()
{
ob.childFrame();	
}
}
