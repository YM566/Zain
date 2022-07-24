package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.Helper;


public class TestBase 

{
	WebDriver driver ;
	Duration dur = Duration.ofSeconds(50);

	@BeforeSuite 
	@Parameters({"browser"})
	public void startDriver(@Optional("firefox") String browserName) throws InterruptedException
	{
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver = new ChromeDriver();
			driver.get("https://essdev856-ax7xdigxbdpf-je.integration.ocp.oraclecloud.com/ic/builder/design/ZainWorkListDev/1.0.3/preview/webApps/zainwebapp/");
			driver.manage().timeouts().implicitlyWait(dur);
			driver.manage().window().maximize();
		}

		else if (browserName.equalsIgnoreCase("firefox"))

		{
			System.setProperty("webdriver.gecko.driver", "E:\\Automation Testing\\geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("-private");
			driver = new FirefoxDriver();
			driver.get("https://essdev856-ax7xdigxbdpf-je.integration.ocp.oraclecloud.com/ic/builder/design/ZainWorkListDev/1.0.3/preview/webApps/zainwebapp/");
			driver.manage().timeouts().implicitlyWait(dur);
			driver.manage().window().maximize();
		}

		else 
		{
			System.out.println("Please Check Your Driver Path..");
		}

	}
	@AfterSuite
	public void stopDriver() 
	{
		driver.quit();
	}
	
	

	// take screenshot when test case fail and add it in the Screenshot folder
	@AfterMethod
	public void screenshotOnFailure(ITestResult result) 
	{
		if (result.getStatus() == ITestResult.FAILURE)
		{
			System.out.println("Failed!");
			System.out.println("Taking Screenshot....");
			Helper.captureScreenshot(driver, result.getName());
		}
	}
}
