package elementsWithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickOnClickOpenNewTabNG2 extends ElementBaseClassTNG {

	@Test
	public void linkFunction2() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[.='Links']")).click();

		System.out.println(driver.getCurrentUrl());

		js.executeScript("window.scrollBy(0,150)", "");

		Thread.sleep(2000);

		String parent = driver.getWindowHandle();

		driver.findElement(By.id("dynamicLink")).click();

		System.out.println(driver.getCurrentUrl());

		Thread.sleep(2000);

		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		Assert.assertTrue(driver.getCurrentUrl().contains("demoqa.com"));

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		for (String child : driver.getWindowHandles()) {
			driver.switchTo().window(child);
		}

		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(parent);
		driver.close();

	}
}
