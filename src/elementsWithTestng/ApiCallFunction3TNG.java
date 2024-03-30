package elementsWithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ApiCallFunction3TNG extends ElementBaseClassTNG

{
	@Test

	public void apicall3() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");

		driver.findElement(By.xpath("//span[.='Links']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		js.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.id("moved")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		WebElement response = driver.findElement(By.id("linkResponse"));

		String responseToken = response.getText();

		System.out.println(responseToken);

	}
}
