package applicationUtility;
import org.openqa.selenium.WebElement;
public interface ApplicationUtility   {
	public void doubleClick(webe button);
	public void rightClick(WebElement button);
	public void singleClick(WebElement button);

	public void switchtowindow(int index);
	public void waitforClick(WebElement ele);
	public void waitforVisibility(WebElement ele);
	public void waitforAlert();	
	public void selectbyvisibletext(WebElement ele, String Text);
	public void selectByIndex(WebElement ele, int index);
	public void selectByValue(WebElement ele, String value);
	public void mouseOver(WebElement ele);
}
