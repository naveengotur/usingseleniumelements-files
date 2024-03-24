package elementsWithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ButtonsFunction extends BaseClass {
	@Test

	public void clickButtons() {

		driver.findElement(By.xpath("//span[.='Buttons']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.id("doubleClickBtn")).click();

		driver.findElement(By.id("Right Click Me")).click();

		driver.findElement(By.id("Click Me")).click();

	}
}
