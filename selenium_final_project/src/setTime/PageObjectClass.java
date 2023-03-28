package setTime;

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

public static WebElement settimeHrText(WebDriver driver) {
	

	  
	return driver.findElement(By.xpath("//input[@aria-controls='select2-vfb-16-hour-results']"));
	  	  
}

public static WebElement settimeMinText(WebDriver driver) {
	  
	return driver.findElement(By.xpath("//input[@aria-controls='select2-vfb-16-min-results']"));
	  	  
}  
}
