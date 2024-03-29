package elementsWithSelenium;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Screenshot {

	public static void main(String[] args) throws IOException { 
			
				//Specify the path to your chrome driver
			    WebDriver driver;
			    
				// Instantiate chrome driver object
				 driver = new ChromeDriver();
				 
				// Navigate to the testim website
				driver.get("https://www.testim.io/");
				
				//Use TakesScreenshot method to capture screenshot
				TakesScreenshot screenshot = (TakesScreenshot)driver;
				
				//Saving the screenshot in desired location
				File source = screenshot.getScreenshotAs(OutputType.FILE);
				
				//Path to the location to save screenshot
				FileUtils.copyFile(source, new File("./SeleniumScreenshots/Screen.png"));
				System.out.println("Screenshot is captured");
				
				driver.quit();
		}
}
