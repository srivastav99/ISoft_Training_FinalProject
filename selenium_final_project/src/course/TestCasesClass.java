package course;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;





public class TestCasesClass {
  @Test
  public void genderTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		//For selecting items
		PageObjectClass.courseSelenium(driver).click();
		PageObjectClass.courseUFT(driver).click();
		PageObjectClass.courseTestNG(driver).click();
		PageObjectClass.courseJava(driver).click();
		PageObjectClass.courseFunctionalTesting(driver).click();
		PageObjectClass.courseOthers(driver).click();
		
		//For de-selecting items
		PageObjectClass.courseSelenium(driver).click();
		PageObjectClass.courseUFT(driver).click();
		PageObjectClass.courseTestNG(driver).click();
		PageObjectClass.courseJava(driver).click();
		PageObjectClass.courseFunctionalTesting(driver).click();
		PageObjectClass.courseOthers(driver).click();
  }
  

}