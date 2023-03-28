package lastName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PageObjectClass {
  @Test
 
public static WebElement lastName(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-7"));
	  	  
}

  
}
