package elementsWithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RadioButtonFunction extends BaseClass {

	@Test
	public void radioButton() throws InterruptedException {

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.xpath("(//div[.='Elements'])[2]")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath("//span[.='Radio Button']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.xpath("//label[.='Yes']")).click();

		WebElement radio1 = driver.findElement(By.xpath("//p[@class='mt-3']"));

		String yesdetails = radio1.getText();

		System.out.println(yesdetails);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.xpath("//label[.='Impressive']")).click();

		WebElement radio2 = driver.findElement(By.xpath("//p[@class='mt-3']"));

		String impressivedetails = radio2.getText();

		System.out.println(impressivedetails);

		Thread.sleep(3000);

		// driver.findElement(By.xpath("//label[@for='noRadio']")).click();

		WebElement radio3 = driver.findElement(By.xpath("//p[@class='mt-3']"));

		String nodetails = radio3.getText();

		System.out.println("No button function is not blocked" + " => " + nodetails);

	}

}
