package elementsWithSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class BrokenLinks extends ElementBaseClassMain {

	public  void brokenImages() throws InterruptedException, IOException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,400)", "");

		driver.findElement(By.xpath("//span[.='Broken Links - Images']")).click();

		System.out.println(driver.getCurrentUrl());

		WebElement brokenimages = driver.findElement(By.xpath("//p[.='Broken image']"));

		String brokenimagesdata = brokenimages.getText();

		System.out.println(brokenimagesdata);
		
		driver.findElement(By.xpath("//img[@src='/images/Toolsqa_1.jpg']"));
		
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File ss = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(ss, new File("./screenshot/brokenimages.png"));
		
		System.out.println("Screenshot is taken");
		
		driver .close();
		

	}
}
