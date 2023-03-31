package address;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class TestCasesClassAddress {
  @Test
  public void StreetAddress() {
	  //System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.streetaddress(driver).sendKeys("M N Reddy Colony");
		
		PageObjectClass.streetaddressAPT(driver).sendKeys("186");
		
		PageObjectClass.streetaddressCity(driver).sendKeys("Hyderabad");
		
		PageObjectClass.streetaddressState(driver).sendKeys("Telangana");
		
		PageObjectClass.streetaddressCode(driver).sendKeys("34534");
		
		PageObjectClass.streetaddressCountry(driver);
		
		PageObjectClass.streetaddressCountryByText(driver);
		
		driver.close();
		
  }
  

}
