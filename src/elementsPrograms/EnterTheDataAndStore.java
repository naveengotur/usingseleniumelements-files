package elementsPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterTheDataAndStore 
{

	public static void main(String[]args)
	{
		WebDriver driver;

		driver = new FirefoxDriver();

		driver.get("https://demoqa.com/");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.xpath("(//div[.='Elements'])[2]")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath("//span[.='Web Tables']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("addNewRecordButton")).click();
		
		WebElement newForm= driver.findElement(By.id("registration-form-modal"));
		
		String EmptyForm = newForm.getText();
		
		System.out.println(EmptyForm);
		
		driver.findElement(By.id("firstName")).sendKeys("Naveen");
		
		driver.findElement(By.id("lastName")).sendKeys("kumar");
		
		driver.findElement(By.id("userEmail")).sendKeys("naveen@gmail.com");
		
		driver.findElement(By.id("age")).sendKeys("30");
		
		driver.findElement(By.id("salary")).sendKeys("10000");
		
		driver.findElement(By.id("department")).sendKeys("IT Employee");
		
		driver.findElement(By.id("submit")).click();
		
		WebElement storedData = driver.findElement(By.xpath("//div[@class='rt-tbody']"));
		
		String displayedData = storedData.getText();
		
		System.out.println(displayedData);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,250)", "");
		
		driver.findElement(By.id("searchBox")).sendKeys("Naveen");
		
		
		driver.close();
		
		
		
	}
}
