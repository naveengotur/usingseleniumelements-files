package elementsWithSelenium;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTab {

	public static void main(String []args) throws InterruptedException
	{
		//control is in the child Tab
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kitchen.applitools.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,400)", "");
		
		driver.findElement(By.xpath("//h3[.='Links']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.xpath("//a[.='The Kitchen - Table']")).click();
		
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		assertTrue(driver.findElement(By.id("fruits-vegetables")).isDisplayed());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
}
