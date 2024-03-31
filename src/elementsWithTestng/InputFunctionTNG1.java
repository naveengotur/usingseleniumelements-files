package elementsWithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InputFunctionTNG1 extends ElementBaseClassTNG {
	//Edit the Data
	
	@Test
	public void editTheData() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='Web Tables']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		js.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.id("edit-record-1")).click();

		WebElement newForm = driver.findElement(By.id("registration-form-modal"));

		String EmptyForm = newForm.getText();

		System.out.println(EmptyForm);

		WebElement previousData = driver.findElement(By.id("userForm"));

		String displayPreviousData = previousData.getText();

		System.out.println(displayPreviousData);

		driver.findElement(By.id("firstName")).clear();

		driver.findElement(By.id("firstName")).sendKeys("Naveen");

		driver.findElement(By.id("submit")).click();

		WebElement storedData = driver.findElement(By.xpath("//div[@class='rt-tbody']"));

		String displayedData = storedData.getText();

		System.out.println(displayedData);

	}
}
