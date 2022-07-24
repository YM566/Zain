package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GymHistoryPage extends PageBase {

	public GymHistoryPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//span[@id='_oj47|text']")
	WebElement AddNewRequestBtn ;
	
	public void AddNewBtn ()
	{
		AddNewRequestBtn.click();;
	}

}
