package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	protected static WebDriver driver;
	
	public static void click(By by) {
		driver.findElement( by ).click();
	}
	
	public static void sendKeys(By by, String value) {
		driver.findElement( by ).sendKeys( value );
	}
	
	public static boolean isDisplayed(By by){
		//WebElement element = browser.findElement( by );
		return driver.findElement( by ).isDisplayed();
	}
	
	public static boolean isEnabled(By by){
		//WebElement element = browser.findElement( by );
		return driver.findElement( by ).isEnabled();
	}
	
	public static String getText(By by){
		return driver.findElement(by).getText();
	}

	public static void submit(By by){
		driver.findElement(by).submit();
	}
	public static void navigateURL(String url) {
		driver.get( url );
	}
	public static void clear(By by) {
		driver.findElement(by).clear();
	}
	
	public  String getAttributeValue(By by, String key ){
		return driver.findElement( by ).getAttribute( key );
	}
	public static void hover(String xPath) {
		// Creating object of an Actions class
		Actions action = new Actions(driver);
		// Performing the mouse hover action on the target element.
		WebElement we = driver.findElement(By.xpath(xPath));
		action.moveToElement(we).build().perform();
	}

	  public static void dropDownvalue(By by,String name) { 
		  Select select = new
          Select(driver.findElement(by)); select.selectByVisibleText(name);
	 }


	
}
