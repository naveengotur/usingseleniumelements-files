package elementsWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextFunction2 {

	public static void main(String [] args) throws InterruptedException
	{
		
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
		
	    driver.findElement(By.xpath("//span[.='Text Box']")).click();
		
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("userName")).sendKeys("Naveen");
		
		driver.findElement(By.id("userEmail")).sendKeys("naveen@gmail.com");
		
		driver.findElement(By.id("currentAddress")).sendKeys("Text Function");
		
		driver.findElement(By.id("permanentAddress")).sendKeys("TestFunction ");
		
		Thread.sleep(2000);
		
		//for click the "Submit" button scrollbar down    
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		 driver.findElement(By.id("submit")).click();
		
		 WebElement submitdata = driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']"));
		 
		String gettext = submitdata.getText();
		
		System.out.println(gettext);
		
		driver.quit();
		
	}
}
