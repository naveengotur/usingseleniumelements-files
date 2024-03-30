package elementsWithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckboxFunctionTNG3 extends BaseClassTNG {

	@Test
	public void checkboxF2() {

		driver.get("https://www.ironspider.ca/forms/checkradio.htm");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath("//input[@value='red']")).click();

		driver.findElement(By.xpath("//input[@value='yellow']")).click();

		driver.findElement(By.xpath("//input[@value='green']")).click();

		driver.findElement(By.xpath("//input[@value='orange']")).click();

		driver.findElement(By.xpath("//input[@value='blue']")).click();

		driver.findElement(By.xpath("//input[@value='purple']")).click();

	}
}
