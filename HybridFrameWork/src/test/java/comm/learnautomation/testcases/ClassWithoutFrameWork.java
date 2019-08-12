package comm.learnautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassWithoutFrameWork {

	@Test
	public static void login() {

		System.setProperty("webdriver.chrome.driver", "C:\\Kunal\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		driver.findElement(By.xpath(
				"//ul[@class='h-c-header__cta-list header__nav--ltr']//a[contains(text(),'Sign in') and @class='h-c-header__nav-li-link ']"))
				.click();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ABC");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

	}
}
