package Com.TestProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	
	public static WebDriver launchBrowser()
	{
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\vivekrajan\\eclipse-workspace\\Driver\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 return driver;
	}
	
	//URLLaunch
	public static void urlLaunch(String s)
	{
		driver.get(s);
	}
	
	//SendKeys
	public static void inputs(WebElement element,String s)
	{
		element.sendKeys(s);
	}
	
	//Click
	public static void clickon(WebElement element)
	{
	 element.click();	
	}

	//get Attribute
	public static String getAttribute(WebElement element,String s) {
		String attributeValue = element.getAttribute(s);
		return attributeValue;		
	}
	
	//SelectByVisibleText
	public static void SelectByVisbibleText(WebElement element,String str)
	{
		Select s =  new Select(element);
		s.selectByVisibleText(str);
	}
	
	//Actions - Double Click
	public static void doubleClick(WebElement element)
	{
		Actions ac = new Actions(driver);
		ac.doubleClick().build().perform();
	}

}
