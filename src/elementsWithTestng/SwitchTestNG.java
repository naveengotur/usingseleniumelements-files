package elementsWithTestng;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwitchTestNG {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void swtichTab() throws InterruptedException {
		driver.get("https://kitchen.applitools.com/");

		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,400)", "");

		driver.findElement(By.xpath("//h3[.='Links']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='The Kitchen - Table']")).click();
		Thread.sleep(2000);
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		assertTrue(driver.findElement(By.id("fruits-vegetables")).isDisplayed());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		System.out.println("SwitchTab is closed");
		driver.close();

	}

	@AfterMethod()
	public void tearDown() {

		driver.quit();
	}

}
