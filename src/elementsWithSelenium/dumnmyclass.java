package elementsWithSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import dev.failsafe.Timeout;

public class dumnmyclass /*extends BaseClassGeneral */
{

	public static void main(String[] args) throws InterruptedException  {

		WebDriver driver;

		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		

		driver.get("https://demoqa.com/elements");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,400)", "");
		
		driver.findElement(By.xpath("//span[.='Upload and Download']")).click();
		
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
		WebElement pagename = driver.findElement(By.xpath("//h1[@class='text-center']"));
		
		String datadisplay = pagename.getText();
		
		System.out.println(datadisplay);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[.='Download']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
