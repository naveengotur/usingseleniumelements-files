package elementsWithSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicProperties  {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver;
		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.xpath("(//div[.='Elements'])[2]")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		
		driver.findElement(By.xpath("//span[.='Dynamic Properties']")).click();

		WebElement dynamic = driver.findElement(By.id("Ad.Plus-970x250-1"));
		
		String dynamicElements = dynamic.getScreenshotAs(null);
		
		
		
		driver.findElement(By.id("enableAfter")).click();
		
		Thread.sleep(7000);
		
		driver.findElement(By.id("colorChange")).click();
		
		Thread.sleep(7000);
		
		driver.findElement(By.id("visibleAfter")).click();
		
		Thread.sleep(7000);
		
		
		driver.close();
	}
}
