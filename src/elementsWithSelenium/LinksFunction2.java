package elementsWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksFunction2 extends BaseClass {

	public static void main(String[] args) {

		driver.findElement(By.xpath("//span[.='Buttons']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.id("dynamicLink")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		/*
		Object browser;
		browser.getAllWindowHandles().then(function (handles) {
			browser.driver.switchTo().window(handles[1]);
			browser.driver.close();
			browser.driver.switchTo().window(handles[0]);
			});
		or 
		
		driver.get("https://demoqa.com/links");
		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.TAB);
		// Opens LambdaTest homepage in the newly opened tab
		driver.navigate().to("https://demoqa.com/");

*/

		driver.close();

	}
}
