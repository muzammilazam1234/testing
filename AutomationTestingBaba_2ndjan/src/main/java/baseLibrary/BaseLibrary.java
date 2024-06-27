package baseLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import applicationUtility.ApplicationUtility;
import excelUtility.excelUtility;
import propertyUtility.PropertyUtility;
import screenShotUtility.ScreenshotUtility;


public class BaseLibrary implements excelUtility, PropertyUtility,ApplicationUtility, ScreenshotUtility
{
	String path = "D:\\New folder\\eclips ide\\AutomationTestingBaba_2ndjan\\Webdriver\\chromedriver.exe";
	
	public static WebDriver driver = null;

	public void launchUrl() {
		
		System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.get("https://testingbaba.com/old/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
       
    
		
	}

	//Method to Read data form Excel file
	@Override
	public String readDatafrmExcel( String path ,int Sheetno, int rno, int colno) {
	String path = "C:\\Users\\Rahul Sinha\\eclipse-workspace\\AutomationTestingBaba_2ndjan\\Test Data\\exceldata.xlsx";
    String val = "";
	try {
    	FileInputStream fis = new FileInputStream(path);
    	XSSFWorkbook wb = new XSSFWorkbook(fis);
    	XSSFSheet sheet = wb.getSheetAt(Sheetno);
    	val = sheet.getRow(rno).getCell(colno).getStringCellValue();		
   } catch (Exception e)
	{
	   System.out.println("issue in get read data" +e);
	}
	return val;
	}

	//Method to Read data from properties file
	@Override
	public String getReadData(String key) {
	    String path="C:\\Users\\Rahul Sinha\\eclipse-workspace\\AutomationTestingBaba_2ndjan\\Test Data\\config.properties";
		String value = "";
	    try {
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			value=prop.getProperty(key);
			
		}catch(Exception e){
			System.out.println("Issue in Get Read Data" +e);
		}
	    return value;
	}
//method for double click on buttons
	@Override
	public void doubleClick(WebElement button) {
		Actions action = new Actions(driver);
		action.doubleClick(button).perform();
		
	}
	//method for right click on buttons
	@Override
	public void rightClick(WebElement button) {
		Actions action = new Actions(driver);
		action.contextClick(button).perform();
	}
	//method for single click on buttons
	@Override
	public void singleClick(WebElement button) {
		Actions action = new Actions(driver);
		action.click(button).perform();
		
	}

	@Override
	public void switchtowindow(int index) {
		Set<String> handles = driver.getWindowHandles();
		ArrayList<String> ListOfHandles = new ArrayList<String>(handles);
		driver.switchTo().window(ListOfHandles.get(index));
		
		
	}

	@Override
	public void waitforClick(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
	}

	@Override
	public void waitforVisibility(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
	}

	@Override
	public void waitforAlert() {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.alertIsPresent());
		
	}

	@Override
	public void mouseOver(WebElement ele) {
		 Actions act = new Actions(driver);
		 act.moveToElement(ele).build().perform();
		 
	}

	@Override
	public void selectbyvisibletext(WebElement ele, String Text) {
		Select sel = new Select(ele);
		sel.deselectByVisibleText(Text);
		
		
	}

	@Override
	public void selectByIndex(WebElement ele, int index) {
		Select sel = new Select(ele);
		sel.selectByIndex(index);
		
	}

	@Override
	public void selectByValue(WebElement ele, String value) 
	{
		Select sel = new Select(ele);
		sel.selectByValue(value);
		sel.getOptions();
		
	}

	//method to generate screenshot of all running methods pass or fail
	@Override
	public void getScreenShot(String foldername, String filename) 
	{
		String loc=System.getProperty("user.id");
		String path = loc+"//Screenshot//"+foldername+"//"+filename+".png";
		
	try {
		EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
		File src = efwd.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
	}catch(Exception e) {
		System.out.println("Issue in taking Ss" +e);
	}	
	} 
	@AfterMethod
	public void getResultAnalysis(ITestResult result)
	{
		String filename = result.getMethod().getMethodName();
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			getScreenShot("pass",filename);
			
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			getScreenShot("Failed",filename);
		}
	}
	}	

