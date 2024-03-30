package elementsWithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ApiCallFunction1TNG extends ElementBaseClassTNG

{
	@Test
	public void apicall1() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		
		driver.findElement(By.xpath("//span[.='Links']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		js.executeScript("window.scrollBy(0,250)", "");
        
		driver.findElement(By.id("created")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
        
		js.executeScript("window.scrollBy(0,250)", "");

		WebElement api = driver.findElement(By.id("linkResponse"));
		String apiaddress = api.getText();
		
		System.out.println(apiaddress);
	}
}
