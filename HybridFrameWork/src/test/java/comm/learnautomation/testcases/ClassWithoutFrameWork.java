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
		driver.get("https://freecrm.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Log In']/parent::a")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ABC");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.quit();
	}
}
