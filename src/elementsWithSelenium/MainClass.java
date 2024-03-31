package elementsWithSelenium;

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
		
		BrokenLinks BL = new BrokenLinks();
		baseclass.setup1();
		BL.brokenImages();
        baseclass.tearDown3();
		
        BrokenLinks2 BL2 = new BrokenLinks2();
        baseclass.setup1();
        BL2.validLink();
        baseclass.tearDown3();
        
        BrokenLinks3 BL3 = new BrokenLinks3();
        baseclass.setup1();
        BL3.brokenLink();
        baseclass.tearDown3();
        
        CheckboxFunction1 cbox = new CheckboxFunction1();
        baseclass.setup1();
        cbox.checkbox();
        baseclass.tearDown3();
        
        CheckboxFunction2 cbox2 = new CheckboxFunction2();
        baseclass.setup1();
        cbox2.checkbox2();
        baseclass.tearDown3();
        
        CheckboxFunctionX cbox3 =new CheckboxFunctionX();
        baseclass.setup1();
        cbox3.checkbox3();
        baseclass.tearDown3();
		
        DeleteTheData obj1 = new DeleteTheData();
		baseclass.setup1();
		obj1.deleteTheClass();
        baseclass.tearDown3();
		
        DownloadFile download=  new DownloadFile();
        baseclass.setup1();
        download.downloadFile();
        baseclass.tearDown3();
        
        ActionClickMe click1 = new ActionClickMe();
        baseclass.setup1();
        click1.clickMe();
        baseclass.tearDown3();
        
        ActionDoubleClick click2 = new ActionDoubleClick();
        baseclass.setup1();
        click2.doubleclick();
        baseclass.tearDown3();
        
        ActionRightClick1 click3 =new ActionRightClick1();
        baseclass.setup1();
        click3.rightClick();
        baseclass.tearDown3();
        
		
	}

}
