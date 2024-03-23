package elementsPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextFunction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

//		driver = new ChromeDriver();

		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");

		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());

		driver.findElement(By.id("email")).sendKeys("naveen94.gotur@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("Abcd@1324");
		
		driver.findElement(By.xpath("//button[.='Log in']")).click();
		
		
		
		//driver.findElement(By.xpath("//a[.='Create a Page']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.close();

	}

}
