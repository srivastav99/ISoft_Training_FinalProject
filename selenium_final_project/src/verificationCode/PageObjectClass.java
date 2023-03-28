package verificationCode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PageObjectClass {
	  @Test
	 
	  public static WebElement firstName(WebDriver driver) {
		  
		  return driver.findElement(By.id("vfb-5"));
		  	  
	}

	public static WebElement lastName(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-7"));
	  	  
	}



	public static WebElement gender(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-31-1"));
	  	  
	}

	public static WebElement streetaddress(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-13-address"));
	  	  
	}

	public static WebElement streetaddressAPT(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-13-address-2"));
	  	  
	}

	public static WebElement streetaddressCity(WebDriver driver) {
	  
	  return driver.findElement(By.name("vfb-13[city]"));
	  	  
	}

	public static WebElement streetaddressState(WebDriver driver) {
	  
	  return driver.findElement(By.name("vfb-13[state]"));
	  	  
	}

	public static WebElement streetaddressCode(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-13-zip"));
	  	  
	}

	public static void streetaddressCountry(WebDriver driver) {
	  
	WebElement c = driver.findElement(By.id("vfb-13-country"));
	Select s = new Select(c);
	s.selectByVisibleText("India");
	  	    	  
	}

	public static WebElement eMail(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-14"));
	  	  
	}


	public static WebElement dodClick(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-18"));
	  	  
	}

	public static WebElement dodNext(WebDriver driver) {
	  
	return driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
	  	  	  
	}


	public static WebElement dodDay(WebDriver driver) {
	  
	return driver.findElement(By.xpath("//a[@data-date='3']"));
	  	  	  
	}


	public static WebElement timeHr(WebDriver driver) {
	  
	  return driver.findElement(By.xpath("//*[@id=\"select2-vfb-16-hour-container\"]"));
	}


	public static void settimeHr(WebDriver driver) {
	  
	  Actions a = new Actions(driver);
	  a.keyDown(Keys.TAB).perform();
	  a.keyDown(Keys.ENTER).perform();
	  a.keyDown(Keys.DOWN).perform();
	  a.keyDown(Keys.DOWN).perform();
	  a.keyDown(Keys.DOWN).perform();
	  a.keyDown(Keys.DOWN).perform();
	  a.keyDown(Keys.DOWN).perform();
	  a.keyDown(Keys.DOWN).perform();
	  a.keyDown(Keys.DOWN).perform();
	  a.keyDown(Keys.DOWN).perform();
	  a.keyDown(Keys.DOWN).perform();
	  a.keyDown(Keys.DOWN).perform();
	  a.keyDown(Keys.ENTER).perform();
	}

	public static WebElement timeMin(WebDriver driver) {
	  
	  return driver.findElement(By.id("select2-vfb-16-min-container"));
	}

	public static void settimeMin(WebDriver driver) {
	  
	  Actions a = new Actions(driver);
	  a.keyDown(Keys.TAB).perform();
	  a.keyDown(Keys.ENTER).perform();
	  a.keyDown(Keys.DOWN).perform();
	  a.keyDown(Keys.DOWN).perform();
	  a.keyDown(Keys.DOWN).perform();
	  a.keyDown(Keys.DOWN).perform();
	  a.keyDown(Keys.DOWN).perform();
	  a.keyDown(Keys.DOWN).perform();
	  a.keyDown(Keys.ENTER).perform();
	}

	public static WebElement mobile(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-19"));
	  	  
	}

	public static WebElement course(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-20-0"));
	  	  
	}

	public static WebElement query(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-23"));	
	  	  
	}

	public static WebElement verificationCode(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-3"));	
	  	  
	}

	public static WebElement submit(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-4"));	
	  	  
	}
  
}
