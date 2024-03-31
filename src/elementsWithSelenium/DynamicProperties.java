package elementsWithSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicProperties  {

	public static void main(String[] args) throws InterruptedException, IOException {


		WebDriver driver;
		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.xpath("(//div[.='Elements'])[2]")).click();

		System.out.println(driver.getCurrentUrl());
		
		js.executeScript("window.scrollBy(0,400)", "");

		driver.findElement(By.xpath("//span[.='Dynamic Properties']")).click();
		
		js.executeScript("window.scrollBy(0,400)", "");

		//WebElement dynamic = driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']"));
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File pageTs= ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(pageTs, new File("./screenshot/dynamicpage.png"));
		
		System.out.println("File downloaded");
		
		js.executeScript("window.scrollBy(0,400)", "");
		
		driver.findElement(By.id("enableAfter")).click();
		
		Thread.sleep(7000);
		
		js.executeScript("window.scrollBy(0,200)", "");
		
		driver.findElement(By.id("colorChange")).click();
		
		Thread.sleep(7000);
		
		js.executeScript("window.scrollBy(0,100)", "");
		
		driver.findElement(By.id("visibleAfter")).click();
		
		Thread.sleep(7000);
		
		
		driver.close();
	}
}
