package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeRequestPage extends PageBase{

	public EmployeeRequestPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//span[@id='oj-select-1_selected']")
	WebElement DropDownList ;

	
	@FindBy(xpath = "//div[@aria-label='Gym Request']")
	WebElement SelectGymRequest ;
	
	
	public void ChoosingTheRequest ()
	{
		ClickButton(DropDownList);
		ClickButton(SelectGymRequest);
	}
}
