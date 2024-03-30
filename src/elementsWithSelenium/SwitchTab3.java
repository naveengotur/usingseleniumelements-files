package elementsWithSelenium;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTab3 {

	public static void main(String[] args) throws InterruptedException {
		// control is in the child tab and close the parent tab.
		// while using the quit(); close the browser ..
		// While using the close(); close the parent tab only child is open how to do?
		
		
		
		WebDriver driver;

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://kitchen.applitools.com/");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,400)", "");

		driver.findElement(By.xpath("//h3[.='Links']")).click();

		
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String parent = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[.='The Kitchen - Table']")).click();

		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		assertTrue(driver.findElement(By.id("fruits-vegetables")).isDisplayed());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		for (String child : driver.getWindowHandles()) {
			driver.switchTo().window(child);
		}

		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		driver.switchTo().window(parent);
		driver.close();
		
		
	}
}
