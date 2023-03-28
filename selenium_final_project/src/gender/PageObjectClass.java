package gender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PageObjectClass {
  @Test
 
public static WebElement genderMale(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-31-1"));
	  	  
}
  
public static WebElement genderfemale(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-31-2"));
	  	  
}

public static WebElement genderOther(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-31-3"));
	  	  
}
  
}
