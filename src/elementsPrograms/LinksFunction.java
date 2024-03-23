package elementsPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksFunction 
{

	public static void main(String[]args)
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
		
		driver.findElement(By.xpath("//span[.='Buttons']")).click();
		
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
	
		driver.findElement(By.id("simpleLink")).click();
		
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
	
		driver.get("https://demoqa.com/links");
		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.TAB);
		// Opens LambdaTest homepage in the newly opened tab
		driver.navigate().to("https://demoqa.com/");
		
		
		
		driver.close();
		
	}
}
