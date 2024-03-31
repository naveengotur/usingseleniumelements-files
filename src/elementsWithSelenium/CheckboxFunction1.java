package elementsWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CheckboxFunction1 extends MainClass {

	public void checkbox()
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.xpath("//span[.='Check Box']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
		js.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();

		WebElement result = driver.findElement(By.id("result"));

		String displayresult = result.getText();

		System.out.print(displayresult);


	}
}
