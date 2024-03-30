package elementsWithSelenium;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTab2 {

	public static void main(String[] args) throws InterruptedException {

		//Control is in the Child tab and swtich to parent tab and close the first child tab and then close the Parent tab
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

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		String parent = driver.getWindowHandle();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[.='The Kitchen - Table']")).click();

		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		Thread.sleep(1000);
		assertTrue(driver.findElement(By.id("fruits-vegetables")).isDisplayed());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		driver.close();

		driver.switchTo().window(parent);

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		driver.close();
		

	}
}
