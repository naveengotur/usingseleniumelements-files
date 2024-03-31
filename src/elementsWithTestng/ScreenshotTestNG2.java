package elementsWithTestng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotTestNG2 extends BaseClassTNG {

	@Test
	public void uploadFile() throws InterruptedException, IOException {
		driver.get("https://www.google.co.in/");

		Thread.sleep(2000);

		TakesScreenshot screenshot = (TakesScreenshot) driver;

		File source = screenshot.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source, new File("./screenshot/Screen.png"));

		System.out.println("Screenshot is captured");

		driver.close();

	}

}
