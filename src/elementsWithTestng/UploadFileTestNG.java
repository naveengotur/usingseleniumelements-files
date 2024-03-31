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

public class UploadFileTestNG  extends ElementBaseClassTNG
{
	
	@Test
	public void uploadFile() throws InterruptedException
	{

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.xpath("//span[.='Upload and Download']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		WebElement pagename = driver.findElement(By.xpath("//h1[@class='text-center']"));

		String datadisplay = pagename.getText();

		System.out.println(datadisplay);

		System.out.println("Above the data displayed ");

		WebElement filename = driver.findElement(By.xpath("//label[.='Select a file']"));

		String datadisplay2 = filename.getText();

		System.out.println(datadisplay2);
		
		js.executeScript("window.scrollBy(0,200)", "");

		String projectpath = System.getProperty("user.dir");
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(projectpath+"\\screenshot\\facebook.png");

		Thread.sleep(3000);

		System.out.println("file is uploaded ");
		
		Thread.sleep(3000);
		
		
	}
	
}
