package elementsWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UploadFile extends BaseClass {

	public static void main(String[] args) {

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

		driver.findElement(By.id("uploadFile")).click();

	}

}