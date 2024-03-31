package elementsWithTestng;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwitchTestNG3 {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void swtichTab2() throws InterruptedException {
		
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
		
		
		
		for (String child : driver.getWindowHandles()) {
			driver.switchTo().window(child);
		}

		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		driver.switchTo().window(parent);
		driver.close();

	}

	@AfterMethod()
	public void tearDown() {

		driver.quit();
	}

}
