package elementsWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonsFunction extends MainClass {

	public static void main(String[] args) {

		driver.findElement(By.xpath("//span[.='Buttons']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.id("doubleClickBtn")).click();

		driver.findElement(By.id("Right Click Me")).click();

		driver.findElement(By.id("Click Me")).click();

		driver.close();

	}
}
