package elementsWithSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Screenshot2 {

	public static void main(String[]args) throws IOException
	{
		
		WebDriver driver;
		
		driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("learn Automation");
		
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		
		File source = screenShot.getScreenshotAs(OutputType.FILE); 
		
		FileUtils.copyFile(source, new File("./screenshot/facebook.png"));
		
		System.out.println("Screenshot Taken");
		
		driver.close();
		
	}
	
	
}
