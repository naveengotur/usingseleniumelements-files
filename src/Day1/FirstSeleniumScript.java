package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		
		System.out.println("Hai Ganesh");
		
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.youtube.com/watch?v=oo8hakhidQM");
	
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
