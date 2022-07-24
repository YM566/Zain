package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequestPage extends PageBase {

	public RequestPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@id='oj-select-choice-GymNames']")
	WebElement GymNameArrow ; 
	
	@FindBy(xpath = "//div[@aria-label='Fitness Time - Ladies']")
	WebElement GymName ; 
	
	@FindBy(xpath = "//input[@name='terms&conditions']")
	WebElement TermsAndCondition ;
	
	@FindBy(xpath = "//*[@id=\"oj-button-submit\"]")
	WebElement SubmitBtn ;
	
	public void SelectGymName () throws InterruptedException
	{
		GymNameArrow.click();
		GymName.click();
		Thread.sleep(500);
		TermsAndCondition.click();
		ClickButton(SubmitBtn);
	}
}
