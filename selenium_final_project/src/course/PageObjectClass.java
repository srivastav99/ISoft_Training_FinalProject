package course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PageObjectClass {
  @Test
 
public static WebElement courseSelenium(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-20-0"));
	  	  
}
  
public static WebElement courseUFT(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-20-1"));
	  	  
}

public static WebElement courseTestNG(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-20-2"));
	  	  
}

public static WebElement courseJava(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-20-3"));
	  	  
}

public static WebElement courseFunctionalTesting(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-20-4"));
	  	  
}

public static WebElement courseOthers(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-20-5"));
	  	  
}
  
}
