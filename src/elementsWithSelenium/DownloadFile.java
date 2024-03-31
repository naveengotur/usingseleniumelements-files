package elementsWithSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class DownloadFile extends ElementBaseClassMain {

	public void downloadFile() throws InterruptedException, IOException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,400)", "");
		
		driver.findElement(By.xpath("//span[.='Upload and Download']")).click();

		System.out.println(driver.getCurrentUrl());
		
		WebElement pagename = driver.findElement(By.xpath("//h1[@class='text-center']"));
		
		String datadisplay = pagename.getText();
		
		System.out.println(datadisplay);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[.='Download']")).click();
		
		Thread.sleep(3000);
		
		TakesScreenshot download = (TakesScreenshot)driver;
		
		File downloadfile = download.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(downloadfile, new File("./screenshot/download.png"));
		
		System.out.println("File downloaded");
		
		System.out.println(driver.getCurrentUrl());
		
		//pending to how to verify, downloaded file
		
	}
}
