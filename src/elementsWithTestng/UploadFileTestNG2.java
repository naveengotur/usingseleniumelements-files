package elementsWithTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadFileTestNG2 extends BaseClassTNG

{
	
	@Test
	public void uploadFile() throws InterruptedException
	{
        driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,250)", "");
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\ADMIN\\Downloads\\sampleFile (1).jpeg");
		
		//or method
		
		String projectpath = System.getProperty("user.dir");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(projectpath+"\\screenshot\\facebook.png");
		
		Thread.sleep(3000);
		
		System.out.println("file is uploaded ");
			
		Thread.sleep(3000);
		
		
	}
	
}
