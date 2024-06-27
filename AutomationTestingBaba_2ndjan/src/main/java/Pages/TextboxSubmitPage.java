package Pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;


public class TextboxSubmitPage extends BaseLibrary {	
	
	public TextboxSubmitPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement Close;
	@FindBy(xpath = "//a[text()='Practice']")
    private WebElement Practice;
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement Elements;
	@FindBy(xpath = "//a[text()='text box']")
	private WebElement Textbox;
	
	@FindBy(xpath = "//input[@id='fullname1']")
	private WebElement fullname;
	@FindBy(xpath = "//input[@id='fullemail1']")
	private WebElement fullemail;
	@FindBy(xpath = "//textarea[@id='fulladdresh1']")
	private WebElement currentaddress;
	@FindBy(xpath = "//textarea[@id='paddresh1']")
	private WebElement paddress;
	
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement button;
	@FindBy(xpath = "//div[@class=\"col-md-6 mt-5\"]/label")
	private List<WebElement> Details;
	
	
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
	public void ClickonTextbox()
	{
		Textbox.click();
	}
	
	public void filldetails()
	{
		fullname.sendKeys(readDatafrmExcel(0,1,0));
		fullemail.sendKeys(readDatafrmExcel(0,1,1));
		currentaddress.sendKeys(readDatafrmExcel(0,1,2));
		paddress.sendKeys(readDatafrmExcel(0,1,3));
		button.click();
		}

	public void getValidateDetails()
	{
		ArrayList<String> expected = new ArrayList<>();
		ArrayList<String> actual =  new ArrayList<>();
		
		for (int i=0; i<=3;i++)
		{
			expected.add(readDatafrmExcel(0,1,i));
		}
		
		for (int i=1; i<=Details.size();i=i+2)
		{
			actual.add(Details.get(i).getText());
		}
		
		for (int i=0;i<=3;i++)
		{
			//Assert.assertEquals(actual.get(i), expected.get(i));
			Assert.assertEquals(actual, expected);
		}
	/*String out = null;
	 for(int i=1;i<Details.size();i=i+2)
	 {
		 out= Details.get(i).getText();	 
	//	if(i%2==1) {
		 System.out.println(out); 
	 }*/
		}

	}

//}
