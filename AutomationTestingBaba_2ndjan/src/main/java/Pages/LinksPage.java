package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class LinksPage extends BaseLibrary
{
 public LinksPage()
   {
   PageFactory.initElements(driver,this);
	}

 @FindBy(xpath="//button[@data-target=\'#elements\']")
 private WebElement Elements;
 
 @FindBy (xpath="//a[text()='links']")
 private WebElement Links;
 @FindBy (xpath="//a[text()='Demo Page']")
 private WebElement demopage;
 @FindBy(xpath="//a[@onclick=\"Created()\"]")
 private WebElement Created;
 @FindBy (xpath="//a[@onclick=\"Content()\"]")
 private WebElement Nocontent;
 @FindBy(xpath="//a[@onclick=\"Moved()\"]")
 private WebElement Moved;
 @FindBy (xpath="//a[@onclick=\"Request()\"]")
 private WebElement Badrequest;
 @FindBy (xpath="//a[@onclick=\"Unauthorized()\"]")
 private WebElement Unauthorized;
 @FindBy (xpath="//a[@onclick=\"Forbidden()\"]")
 private WebElement Forbidden;
 @FindBy(xpath="//a[@onclick=\"Found()\"]")
 private WebElement Notfound;
 
 public void element()
 {
	 Elements.click();
 }
 public void Links()
 {
	 Links.click();
	 
 }

 public void demopage() throws InterruptedException
 {
	 demopage.click();
	 switchtowindow(1);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[text()='×']")).click();
 
		/*Created.click();
		switchtowindow(2);
		 
		 Nocontent.click();switchtowindow(3);	 Thread.sleep(2000);
		 Moved.click();switchtowindow(4);	 Thread.sleep(2000);
		 Badrequest.click();switchtowindow(5);	 Thread.sleep(2000);
		 Unauthorized.click();switchtowindow(6);	 Thread.sleep(2000);
		 Forbidden.click();switchtowindow(7);	 Thread.sleep(2000);
		 Notfound.click();switchtowindow(8);
		 */
 }

}

