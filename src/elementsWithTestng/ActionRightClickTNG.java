package elementsWithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionRightClickTNG extends ElementBaseClassTNG {
	@Test

	public void clickButtons() throws InterruptedException {

		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		
		driver.findElement(By.xpath("//span[.='Buttons']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
		//driver.get("https://demoqa.com/buttons"); // Define the URL of the target website.
		Actions act = new Actions(driver);

		Thread.sleep(2000);
		
		//Right click on element
		WebElement rightele = driver.findElement(By.id("rightClickBtn")); 
		act.contextClick(rightele).perform();
		

		js.executeScript("window.scrollBy(0,300)", "");

		WebElement rightclk = driver.findElement(By.id("rightClickMessage"));
		
		String rightText = rightclk.getText();
		
		System.out.println(rightText);

		

	}
}
