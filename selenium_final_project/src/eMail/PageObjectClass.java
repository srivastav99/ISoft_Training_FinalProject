package eMail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PageObjectClass {
  @Test
 
public static WebElement eMail(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-14"));
	  	  
}


  
}
