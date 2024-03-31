package elementsWithTestng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotTestNG 
{

	WebDriver driver;

	@Test
	public void screenShot() throws InterruptedException, IOException {

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		

		driver.get("https://testng.org/testng-eclipse-update-site");

		Thread.sleep(2000);

		TakesScreenshot ss = (TakesScreenshot) driver;

		File src = ss.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("./screenshot/testng.png"));

		System.out.println("Screenshot is taken");
		
		driver.close();
		

	}

}
