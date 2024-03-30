package elementsWithSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainClass {

	public static WebDriver driver;

	public static void main(String[] args) throws CloneNotSupportedException {

		DeleteTheData obj1 = new DeleteTheData();
		obj1.deleteTheClass();

		ApiCallFunction obj2 = new ApiCallFunction();
		obj2.apiCallFunction();
		
		ApiCallFunction2 obj3 =new ApiCallFunction2();
		obj3.apiCallFunction2();
		
		ApiCallFunction3 obj4 =new ApiCallFunction3();
		obj4.apiCallFunction3();
		
		ApiCallFunction3 obj5 =new ApiCallFunction3();
		obj5.apiCallFunction3();
		
		ApiCallFunction4 obj6 = new ApiCallFunction4();
		obj6.apiCallFunction4();
		
		ApiCallFunction5 obj7= new ApiCallFunction5();
		obj7.apiCallFunction5();
		
		ApiCallFunction6 obj8= new ApiCallFunction6();
		obj8.apiCallFunction6();
		
		ApiCallFunction7 obj9 =new ApiCallFunction7();
		obj9.apiCallFunction7();
		
		
		
		
		
		
	}

}
