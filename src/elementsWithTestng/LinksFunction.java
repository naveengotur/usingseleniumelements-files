package elementsWithTestng;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LinksFunction extends ElementBaseClassTNG {

	@Test
	public void linksFunction() throws InterruptedException {

		driver.findElement(By.xpath("//span[.='Links']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.id("simpleLink")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		String parent = driver.getWindowHandle();

		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		assertTrue(driver.getCurrentUrl().contains("demoqa")).isDisplayed());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		for (String child : driver.getWindowHandles()) {
			driver.switchTo().window(child);
		}

		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		driver.switchTo().window(parent);
		driver.close();

	}
}
