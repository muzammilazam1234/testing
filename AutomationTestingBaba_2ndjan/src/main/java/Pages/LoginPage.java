package Pages;
import baseLibrary.BaseLibrary;

public class LoginPage extends BaseLibrary{

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

     @FindBy(xpath = "//button[text()='×']")
	private WebElement close;

    @FindBy(xpath = "//a[text()='Practice']")
    private WebElement Practice;
     
	public void clickonClose() {
		close.click();
	}

	public void Practiceclick()
	{
		Practice.click();
	}
   public void geturl()
   {
	  String url= driver.getCurrentUrl();
	  System.out.println(url);
   }
	public void gettitle()
    {
    	String val=driver.getTitle();
    	System.out.println(val);
    }
	
}

