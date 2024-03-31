package elementsWithSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class BrokenLinks2 extends ElementBaseClassMain {

	public  void validLink() throws InterruptedException, IOException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,400)", "");

		driver.findElement(By.xpath("//span[.='Broken Links - Images']")).click();

		System.out.println(driver.getCurrentUrl());

		WebElement validLink = driver.findElement(By.xpath("//p[.='Valid Link']"));

		String validLinkdata = validLink.getText();

		System.out.println(validLinkdata);	
		
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//a[.='Click Here for Valid Link']")).click();

		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//html"));

		TakesScreenshot ts = (TakesScreenshot) driver;

		File validlink = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(validlink, new File("./screenshot/brokenimages.png"));

		System.out.println("Screenshot is taken");
		
		System.out.println(driver.getCurrentUrl());

	}
}
