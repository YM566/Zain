package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);

	}
	
	
	@FindBy(xpath = "//i[@class='oj-ux-ico-chart-pie-segment']")
	WebElement EmployeeRequest ;
	
	public void SelectEmployeeRequest ()
	{
		EmployeeRequest.click();
	}

}
