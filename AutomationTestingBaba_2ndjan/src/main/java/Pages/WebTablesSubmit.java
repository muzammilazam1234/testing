package Pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;



public class WebTablesSubmit extends BaseLibrary {

	public WebTablesSubmit()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='×']")
	private WebElement Close;
	@FindBy(xpath = "//a[text()='Practice']")
    private WebElement Practice;
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement Elements;
	@FindBy (xpath="//a[text()='web tables']")
	private WebElement WebTables;
	@FindBy (xpath="//input[@pattern='^[a-zA-Z][\\sa-zA-Z]{2,32}']")
	private WebElement Name;
	@FindBy (xpath="//input[@title=\"eg name@gmail.com\"]")
	private WebElement Email;
	@FindBy (xpath="//button[text()='Save']")
	private WebElement Save;
	@FindBy (xpath="//iframe[@src='Webtable.html']")
	private WebElement Frame;
	@FindBy (xpath="//button[text()='Edit']")
	private List<WebElement> Editbutton;
	@FindBy(xpath="//input[@name=\"edit_name\"]")
	private WebElement editname;
	@FindBy(xpath="//input[@name='edit_email']")
	private WebElement editEmail;
	@FindBy(xpath="//button[@class=\"btn btn-info btn-xs btn-update\"]")
	private WebElement updateButton;
	
	
	@FindBy(xpath="//table//tr[@data-name=td]")
	private List <WebElement> Tabledata;
	//@FindBy(xpath="//div[@class='container-fluid']/table")
	//private List<WebElement> Tabledata;
	public void ClickonClose()
	{
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
	public void clickonWebTables()
	{
		WebTables.click();
	}
	public void filldetails()
	{
		driver.switchTo().frame(Frame);
		for(int i=1;i<=3;i++)
		{
		Name.sendKeys(readDatafrmExcel(1,i,0));
		Email.sendKeys(readDatafrmExcel(1,i,1));
		Save.click();
		}
		driver.switchTo().defaultContent();	
	}
	
	public void updateTable()
	{
	    int i=1;
		driver.switchTo().frame(Frame);
		for(WebElement Edit:Editbutton)
		{
			Edit.click();
			editname.clear();
			editname.sendKeys(readDatafrmExcel(1,i,2));
			editEmail.clear();
			editEmail.sendKeys(readDatafrmExcel(1,i,3));
			updateButton.click();
			i++;
		}
		driver.switchTo().defaultContent();
	}
	
	public void getValidate()
{int i=1;
		
		driver.switchTo().frame(Frame);
		ArrayList<String> expected = new ArrayList<>();
		ArrayList<String> actual= new ArrayList<>();

		
		for( i=1; i<=3; i++)
		{
		expected.add(readDatafrmExcel(1,i,2));
		expected.add(readDatafrmExcel(1,i,3));
   	}
		for(WebElement Edit:Editbutton)
		{
			Edit.click();
			actual.add(Tabledata.get(i).getText());
			i++;
	}
		
		//validation
		driver.switchTo().frame(Frame);
		for(i=0;i<=Tabledata.size();i++);
		{
		Assert.assertEquals(actual.get(i),expected.get(i));
		}
		driver.switchTo().defaultContent();
		System.out.println("Validation Successful");
}
	
	/*<public void compareElements() throws InterruptedException {
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		driver.switchTo().frame(Frame);
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-xs btn-edit']")).click();
		Thread.sleep(2000);
		String webName = editname.getText();
		String webEmail = editEmail.getText();
		String excelname = readDatafrmExcel(1, 1, 2);
		if(webName.equals(excelname)) {
			System.out.println("Name is match");
		}
		else {
			System.out.println("Name is mismatch");
			driver.switchTo().defaultContent();
		}*/
		}
