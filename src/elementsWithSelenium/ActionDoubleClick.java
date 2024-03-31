package elementsWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionDoubleClick extends ElementBaseClassMain {

	public void doubleclick() throws InterruptedException {

		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		
		driver.findElement(By.xpath("//span[.='Buttons']")).click();

		System.out.println(driver.getCurrentUrl());
		
		js.executeScript("window.scrollBy(0,250)", "");
		
		//driver.get("https://demoqa.com/buttons"); // Define the URL of the target website.
		Actions act = new Actions(driver);

		//Double click on element
		WebElement ele = driver.findElement(By.id("doubleClickBtn")); 
		act.doubleClick(ele).perform();

		js.executeScript("window.scrollBy(0,300)", "");

		WebElement dc = driver.findElement(By.id("doubleClickMessage"));
		
		String dcText = dc.getText();
		
		System.out.println(dcText);

	}
}
