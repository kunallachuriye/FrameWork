package comm.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import comm.learnautomation.utility.BrowserFactory;

public class LogInTestGmail {
	WebDriver driver;
	@Test
	public void loginApp()
	{
		driver=BrowserFactory.startApplication(driver, "chrome", "https://www.facebook.com");
		System.out.println(driver.getTitle());
	}

}
