package datePicker;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;




public class TestCasesClass {
  @Test
  public void dodByClick() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.dodClick(driver).click();
		PageObjectClass.dodNext(driver).click();
		PageObjectClass.dodDay(driver).click();
		
		Actions a = new Actions(driver);
		a.keyDown(Keys.ENTER).perform();
		
		
  }
  
  @Test
  public void dodByText() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.dodText(driver).sendKeys("04/05/2023");
		
		Actions a = new Actions(driver);
		a.keyDown(Keys.ENTER).perform();
		
		
  }
  

  
  

}
