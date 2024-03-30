package elementsWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DownloadFile extends MainClass {

	public static void main (String[]args)
	{
		
		driver.findElement(By.xpath("//span[.='Upload and Download']")).click();
		
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
		WebElement pagename = driver.findElement(By.xpath("//h1[@class='text-center']"));
		
		String datadisplay = pagename.getText();
		
		System.out.println(datadisplay);
		
		driver.findElement(By.xpath("//a[.='Download']")).click();
		
		//pending to how to verify, downloaded file
		
	}
}
