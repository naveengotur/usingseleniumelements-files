package elementsWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenLinks extends MainClass {

	public static void main(String[] args) {

		driver.findElement(By.xpath("//span[.='Broken Links - Images']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		WebElement brokenimages = driver.findElement(By.xpath("//p[.='Broken image']"));

		String brokenimagesdata = brokenimages.getText();

		System.out.println(brokenimagesdata);

		driver.findElement(By.xpath("//a[.='Click Here for Valid Link']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
		WebElement validLink = driver.findElement(By.xpath("//p[.='Valid Link']"));

		String validLinkdata = validLink.getText();

		System.out.println(validLinkdata);
		

		driver.findElement(By.xpath("//span[.='Broken Links - Images']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
		WebElement brokenLink = driver.findElement(By.xpath("//p[.='Broken Link']"));

		String brokenLinkdata = brokenLink.getText();

		System.out.println(brokenLinkdata);
		
		driver.findElement(By.xpath("//a[.='Click Here for Broken Link']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
		driver .close();
		

	}
}
