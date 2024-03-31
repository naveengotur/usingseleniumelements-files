package elementsWithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CheckboxFunctionTNG2 extends ElementBaseClassTNG {
	@Test

	public void checkboxF1() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[.='Check Box']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		js.executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();

		WebElement result = driver.findElement(By.id("result"));

		String displayresult = result.getText();

		System.out.println(displayresult);

		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();

		js.executeScript("window.scrollBy(0,400)", "");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(400,0)", "");
		
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		
		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		

	}
}
