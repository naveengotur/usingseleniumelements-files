package elementsWithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CheckboxFunction extends BaseClass {
	@Test

	public void checkboxF1() {

		driver.findElement(By.xpath("//span[.='Check Box']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();

		WebElement result = driver.findElement(By.id("result"));

		String displayresult = result.getText();

		System.out.print(displayresult);

	}
}
