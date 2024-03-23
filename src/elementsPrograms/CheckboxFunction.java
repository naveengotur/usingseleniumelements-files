package elementsPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CheckboxFunction {

	public static void main(String[] args) {

		WebDriver driver;

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.xpath("(//div[.='Elements'])[2]")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//span[.='Check Box']")).click();
		
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
	
	    driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
	
	    WebElement result = driver.findElement(By.id("result"));
		
		String displayresult = result.getText();
		
		System.out.print(displayresult);
	    
		driver.close();
		
		
		
		
	}
}
