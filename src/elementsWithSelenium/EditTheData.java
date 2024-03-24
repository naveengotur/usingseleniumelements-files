package elementsWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditTheData extends BaseClass {

	public static void main(String[] args) {

		driver.findElement(By.xpath("//span[.='Web Tables']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,250)", "");

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

		driver.close();

	}
}
