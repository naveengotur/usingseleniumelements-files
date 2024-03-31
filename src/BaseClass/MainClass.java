package BaseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import elementsWithSelenium.ApiCallFunction;
import elementsWithSelenium.ApiCallFunction2;
import elementsWithSelenium.ApiCallFunction3;
import elementsWithSelenium.ApiCallFunction4;
import elementsWithSelenium.ApiCallFunction5;
import elementsWithSelenium.ApiCallFunction6;
import elementsWithSelenium.ApiCallFunction7;
import elementsWithSelenium.BrokenLinks;
import elementsWithSelenium.DeleteTheData;

public class MainClass {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ElementBaseClassMain baseclass= new ElementBaseClassMain();
		
        ApiCallFunction obj2 = new ApiCallFunction();
		baseclass.setup1();
		obj2.apiCallFunction();
		baseclass.tearDown3();
		
		ApiCallFunction2 obj3 =new ApiCallFunction2();
		baseclass.setup1();
		obj3.apiCallFunction2();
		baseclass.tearDown3();
		
		ApiCallFunction3 obj4 =new ApiCallFunction3();
		baseclass.setup1();
		obj4.apiCallFunction3();
		baseclass.tearDown3();
		
		ApiCallFunction3 obj5 =new ApiCallFunction3();
		baseclass.setup1();
		obj5.apiCallFunction3();
		baseclass.tearDown3();
		
		ApiCallFunction4 obj6 = new ApiCallFunction4();
		baseclass.setup1();
		obj6.apiCallFunction4();
		baseclass.tearDown3();
		
		ApiCallFunction5 obj7= new ApiCallFunction5();
		baseclass.setup1();
		obj7.apiCallFunction5();
		baseclass.tearDown3();
		
		ApiCallFunction6 obj8= new ApiCallFunction6();
		baseclass.setup1();
		obj8.apiCallFunction6();
		baseclass.tearDown3();
		
		ApiCallFunction7 obj9 =new ApiCallFunction7();
		baseclass.setup1();
		obj9.apiCallFunction7();
		baseclass.tearDown3();
		
		BrokenLinks obj10 = new BrokenLinks();
		baseclass.setup1();
		obj10.brokenImages();
        baseclass.tearDown3();
		

        
		DeleteTheData obj1 = new DeleteTheData();
		baseclass.setup1();
		obj1.deleteTheClass();
        baseclass.tearDown3();
        
        
		
		
		
		
		
	}

}
