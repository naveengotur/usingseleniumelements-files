package elementsWithSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApiCallFunction6 extends ElementBaseClassMain {
	public void apiCallFunction6() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.xpath("//span[.='Links']")).click();

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.id("unauthorized")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		WebElement response = driver.findElement(By.id("linkResponse"));

		String responseToken = response.getText();

		System.out.println(responseToken);

		driver.close();

	}
}
