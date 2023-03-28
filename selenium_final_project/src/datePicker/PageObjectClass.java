package datePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PageObjectClass {
  @Test
 
public static WebElement dodClick(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-18"));
	  	  
}

public static WebElement dodNext(WebDriver driver) {
	  
	return driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
	  	  	  
}


public static WebElement dodDay(WebDriver driver) {
	  
	return driver.findElement(By.xpath("//a[@data-date='3']"));
	  	  	  
}

public static WebElement dodText(WebDriver driver) {
	  
	  return driver.findElement(By.id("vfb-18"));
	  	  
}

  
}
