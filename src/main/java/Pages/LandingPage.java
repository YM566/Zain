package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends PageBase{

	public LandingPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "idcs-signin-basic-signin-form-username")
	WebElement UserName ;

	@FindBy(id = "idcs-signin-basic-signin-form-password|input")
	WebElement Password ;

	@FindBy(xpath = "//span[@id='ui-id-4']")
	WebElement LoginBtn ;

	public void UserCanLoginSuccessfully ()
	{
		UserName.sendKeys("nada.rateb");
		Password.sendKeys("Wind@wind123");
		ClickButton(LoginBtn);
	}
}
