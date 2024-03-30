package elementsWithTestng;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotTestNG {

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void uploadFile() throws InterruptedException
	{	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	
	
	}
	
	@AfterMethod()
	public void tearDown() {
		
		driver.quit();
	}
	
	
}
