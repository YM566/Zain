package Tests;

import org.testng.annotations.Test;
import Pages.EmployeeRequestPage;
import Pages.GymHistoryPage;
import Pages.GymRequestPage;
import Pages.HomePage;
import Pages.LandingPage;
import Pages.RequestPage;

public class Medical_Insurance_Request_Test extends TestBase {

	LandingPage landingpageobject ;
	HomePage homepageobject ;
	EmployeeRequestPage employeerequestpageobject ;
	GymRequestPage gymrequestpageobject ;
	GymHistoryPage gymhistorypageobject ;
	RequestPage requestpageobject ;

	@Test
	public void gymrequesttest () throws InterruptedException
	{
		landingpageobject = new LandingPage(driver);
		landingpageobject.UserCanLoginSuccessfully();
		Thread.sleep(20000);
		homepageobject = new HomePage(driver);
		homepageobject.SelectEmployeeRequest();
		Thread.sleep(5000);
		employeerequestpageobject = new EmployeeRequestPage(driver);
		employeerequestpageobject.ChoosingTheRequest();
		Thread.sleep(5000);
		gymrequestpageobject = new GymRequestPage(driver);
		gymrequestpageobject.ClickOnTheIcon();
		Thread.sleep(6000);
		gymhistorypageobject = new GymHistoryPage(driver);
		Thread.sleep(5000);
		gymhistorypageobject.AddNewBtn();
		Thread.sleep(5000);
		requestpageobject = new RequestPage(driver);
		requestpageobject.SelectGymName();
		Thread.sleep(3000);	
	}

}
