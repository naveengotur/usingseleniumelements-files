package elementsWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile2 {

	public static void main(String []args) throws InterruptedException
	{
	
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,250)", "");
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\ADMIN\\Downloads\\sampleFile (1).jpeg");
		
		String projectpath = System.getProperty("user.dir");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(projectpath+"\\screeshot\\facebook.png");
		
		Thread.sleep(3000);
		
		System.out.println("file is uploaded ");
		
		
		Thread.sleep(3000);
		driver.close();
		
	}
}
