package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GymRequestPage extends PageBase{

	public GymRequestPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//div[@class='oj-avatar-background-image']")
	WebElement GymRequestIcon ; 

	public void ClickOnTheIcon ()
	{
		ClickButton(GymRequestIcon);
	}
	
}
