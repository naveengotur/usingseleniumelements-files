package elementsWithTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ApiCallFunction2TNG extends ElementBaseClassTNG

{
	@Test
	public void apicall2() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");

		driver.findElement(By.xpath("//span[.='Links']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		js.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.id("no-content")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
		js.executeScript("window.scrollBy(0,250)", "");

		WebElement response = driver.findElement(By.id("linkResponse"));

		String responseToken = response.getText();

		System.out.println(responseToken);

	}
}
