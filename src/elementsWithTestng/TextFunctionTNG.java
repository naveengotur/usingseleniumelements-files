package elementsWithTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TextFunctionTNG extends BaseClassTNG {

	@Test

	public void TextFunction() throws InterruptedException {

		driver.get("https://www.facebook.com/");

		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());

		driver.findElement(By.id("email")).sendKeys("naveen94.gotur@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("Abcd@1324");

		driver.findElement(By.xpath("//button[.='Log in']")).click();

		Thread.sleep(2000);

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

	}

}
