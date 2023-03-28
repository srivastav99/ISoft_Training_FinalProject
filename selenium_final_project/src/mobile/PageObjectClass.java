package mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PageObjectClass {
  @Test
 
public static WebElement mobile(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-19"));
	  	  
}
  
}
