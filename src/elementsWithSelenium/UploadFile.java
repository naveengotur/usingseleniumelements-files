package elementsWithSelenium;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile extends MainClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		
		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,250)", "");
		

		driver.findElement(By.xpath("(//div[.='Elements'])[2]")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.xpath("//span[.='Upload and Download']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		WebElement pagename = driver.findElement(By.xpath("//h1[@class='text-center']"));

		String datadisplay = pagename.getText();

		System.out.println(datadisplay);

		System.out.println("Above the data displayed ");

		WebElement filename = driver.findElement(By.xpath("//label[.='Select a file']"));

		String datadisplay2 = filename.getText();

		System.out.println(datadisplay2);

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,250)", "");

		String projectpath = System.getProperty("user.dir");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(projectpath+"\\screeshot\\facebook.png");

		Thread.sleep(3000);

		System.out.println("file is uploaded ");
		
		Thread.sleep(3000);
		driver.close();

	}

}