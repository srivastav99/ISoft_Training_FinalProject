package mobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestCasesClassmobile {
  @Test (priority = 1)
  public void correctmobileTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.mobile(driver).sendKeys("2836383732");
		
		driver.close();
  }
  
 
  @Test (priority = 2)
  public void incorrectMobileTest1() {
	   System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.mobile(driver).sendKeys("32234");
		
		driver.close();
  }
  
  
  @Test (priority = 3)
  public void incorrectMobileTest2() {
	   System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.mobile(driver).sendKeys("28363837324535354");
		
		driver.close();
		
  }
  
  
  @Test (priority = 4)
  public void incorrectMobileTest3() {
	   System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.mobile(driver).sendKeys("283638sdec");
		
		driver.close();
		
  }
  
  
  @Test (priority = 5)
  public void incorrectMobileTest4() {
	   System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.mobile(driver).sendKeys("sdfeecjitf");
		
		driver.close();
		
  }
}
