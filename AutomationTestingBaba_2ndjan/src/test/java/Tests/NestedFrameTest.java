package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.NestedFrame;
import baseLibrary.BaseLibrary;


public class NestedFrameTest extends BaseLibrary{

	NestedFrame ob;
	
	@BeforeTest
	public void LaunchUrl()
	{
		launchUrl();
		ob=new NestedFrame();
	}
	
	@Test(priority=1)
	public void clkonFrameWindow()
	{
	  ob.FrameWindowclk();
	}
	@Test(priority=2)
	public void frameEntry()
	{
		ob.NestedFrameTabopen();
	}
	@Test(priority=3)
	public void nestedFrameEntry()
	{
		ob.nestedFramesEntry();
	}
}
