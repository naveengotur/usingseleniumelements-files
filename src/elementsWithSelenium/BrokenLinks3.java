package elementsWithSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class BrokenLinks3 extends ElementBaseClassMain {

	public void brokenLink() throws InterruptedException, IOException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,400)", "");

		driver.findElement(By.xpath("//span[.='Broken Links - Images']")).click();

		System.out.println(driver.getCurrentUrl());
		
		js.executeScript("window.scrollBy(0,250)", "");
		
		WebElement brokenLink = driver.findElement(By.xpath("//p[.='Broken Link']"));

		String brokenLinkdata = brokenLink.getText();

		System.out.println(brokenLinkdata);
		
		js.executeScript("window.scrollBy(0,250)", "");
		
		driver.findElement(By.xpath("//a[.='Click Here for Broken Link']")).click();

		System.out.println(driver.getCurrentUrl());
		
		String brokenLink2 = driver.findElement(By.id("content")).getText();
		
		System.out.println(brokenLink2);
		
		Thread.sleep(2000);
		
		TakesScreenshot brokenlink = (TakesScreenshot)driver;
		
		File error = brokenlink.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(error, new File("./screenshot/brokenlink.png"));
		
		System.out.println("Screenshot taken");

		System.out.println(driver.getCurrentUrl());

	}
}
