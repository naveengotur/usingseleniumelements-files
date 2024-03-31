package elementsWithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TextFunctionTNG2 extends ElementBaseClassTNG {

	@Test

	public void textFunction2() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("//span[.='Text Box']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		js.executeScript("window.scrollBy(0,250)", "");
		
		driver.findElement(By.id("userName")).sendKeys("Naveen");

		driver.findElement(By.id("userEmail")).sendKeys("naveen@gmail.com");

		driver.findElement(By.id("currentAddress")).sendKeys("Text Function");

		driver.findElement(By.id("permanentAddress")).sendKeys("TestFunction ");

		Thread.sleep(2000);

		// for click the "Submit" button scrollbar down
		
		js.executeScript("window.scrollBy(0,400)", "");

		driver.findElement(By.id("submit")).click();

		WebElement submitdata = driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']"));

		String gettext = submitdata.getText();

		System.out.println(gettext);
 
	}
}
