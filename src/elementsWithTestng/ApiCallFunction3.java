package elementsWithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ApiCallFunction3 extends BaseClass

{
	@Test

	public void apicall3() {

		driver.findElement(By.xpath("//span[.='Buttons']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.id("moved")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		WebElement response = driver.findElement(By.id("linkResponse"));

		String responseToken = response.getText();

		System.out.println(responseToken);

	}
}
