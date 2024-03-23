package elementsPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CreateMultipleUser 
{

	@AfterMethod
	
	public void setup()
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.quit();
		
	}
	
	@Test
	public void login() {
		
	}
}
