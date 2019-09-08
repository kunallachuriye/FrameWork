package comm.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	public static void captureScreenShot(WebDriver ldriver) {
		File src = ((TakesScreenshot) ldriver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File("./Screenshots/FreeCrm/LogIn" + getCurrentDate() + ".png"));
			System.out.println("Screenshot taken Successfully");
		} catch (IOException e) {
			System.out.println("Not able to Take Screenshot " + e.getMessage());
		}
	}

	public static String getCurrentDate() {
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date curentDate = new Date();
		return customFormat.format(curentDate);

	}

	public static void handleFrames() {

	}

	public static void handleAlerts() {

	}

	public static void handleMultipleWindows() {

	}

	public static void handleSyncIssues() {

	}

	public static void javaScriptExecutor() {

	}

}
