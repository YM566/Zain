package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	
	public JavascriptExecutor jse ;
	public PageBase (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void ClickButton (WebElement button)
	{
		button.click();
	}
	
	public static void SetTextElement (WebElement textElement , String value )
	{
		textElement.sendKeys(value);
	}
	
	public void scrollToBottom() 

	{
		jse.executeScript("scrollBy(0,2500)"); 
	}

}
