package elementsWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/upload-download");
		
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,400)", "");

		String projectpath = System.getProperty("user.dir");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(projectpath+"\\screeshot\\facebook.png");

		Thread.sleep(3000);

		driver.close();
		

	}

}
