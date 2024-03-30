package elementsWithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClickMe extends ElementBaseClassTNG {
	@Test

	public void clickButtons() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");

		driver.findElement(By.xpath("//span[.='Buttons']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		js.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.xpath("//button[.='Click Me']")).click();

		WebElement clickMe = driver.findElement(By.id("dynamicClickMessage"));

		String clickMeText = clickMe.getText();

		System.out.println(clickMeText);

	}
}
