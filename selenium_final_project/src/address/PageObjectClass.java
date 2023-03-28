package address;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PageObjectClass {
  @Test
 
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
 
public static void streetaddressCountryByText(WebDriver driver) {
	  
	driver.findElement(By.xpath("//*[@id=\"item-vfb-13\"]/div/span[6]/span/span[1]/span")).click();
	driver.findElement(By.className("select2-search__field")).sendKeys("india");
	Actions a = new Actions(driver);
	a.keyDown(Keys.ENTER).perform();
	  	    	  
}

  
}
