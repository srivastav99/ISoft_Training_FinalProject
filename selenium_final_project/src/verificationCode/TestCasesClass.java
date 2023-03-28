package verificationCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import submit.PageObjectClass;





public class TestCasesClass {
  @Test
  public void verificationCodeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.verificationCode(driver).sendKeys("99");
  }

  @Test
  public void correctverificationCodeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.firstName(driver).sendKeys("Byna");
		PageObjectClass.lastName(driver).sendKeys("Srivastav");

		PageObjectClass.gender(driver).click();
		
		PageObjectClass.streetaddress(driver).sendKeys("M N Reddy Colony");
		PageObjectClass.streetaddressAPT(driver).sendKeys("186");
		PageObjectClass.streetaddressCity(driver).sendKeys("Hyderabad");
		PageObjectClass.streetaddressState(driver).sendKeys("Telangana");
		PageObjectClass.streetaddressCode(driver).sendKeys("34534");
		PageObjectClass.streetaddressCountry(driver);
		
		PageObjectClass.eMail(driver).sendKeys("selenium@gmail.com");

		PageObjectClass.dodClick(driver).click();
		PageObjectClass.dodNext(driver).click();
		PageObjectClass.dodDay(driver).click();

		
		PageObjectClass.dodClick(driver).click();
		
		//SignUp.timeHr(driver).click();
	
		PageObjectClass.settimeHr(driver);
		
	
		
		//SignUp.timeMin(driver).click();
		PageObjectClass.settimeMin(driver); 
		
		
		PageObjectClass.mobile(driver).sendKeys("2379948338");
		
		PageObjectClass.course(driver).click();

		PageObjectClass.query(driver).sendKeys("What is the duration of course.");
		
		PageObjectClass.verificationCode(driver).sendKeys("99"); //correct verification code
		
		PageObjectClass.submit(driver).click(); 
		
		String PgTitle = driver.getTitle(); 
		
		String expPgTitle = "Demo Site – Dynamic Transaction – NxtGen A.I Academy";
		
		if(PgTitle.contentEquals(expPgTitle)) {
			System.out.println("correctverificationCodeTest testcase : Pass");
		}
		else {
			System.out.println("correctverificationCodeTest testcase : Fail");
		}
  }
  
  
  @Test
  public void incorrectverificationCodeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.firstName(driver).sendKeys("Byna");
		PageObjectClass.lastName(driver).sendKeys("Srivastav");

		PageObjectClass.gender(driver).click();
		
		PageObjectClass.streetaddress(driver).sendKeys("M N Reddy Colony");
		PageObjectClass.streetaddressAPT(driver).sendKeys("186");
		PageObjectClass.streetaddressCity(driver).sendKeys("Hyderabad");
		PageObjectClass.streetaddressState(driver).sendKeys("Telangana");
		PageObjectClass.streetaddressCode(driver).sendKeys("34534");
		PageObjectClass.streetaddressCountry(driver);
		
		PageObjectClass.eMail(driver).sendKeys("selenium@gmail.com");

		PageObjectClass.dodClick(driver).click();
		PageObjectClass.dodNext(driver).click();
		PageObjectClass.dodDay(driver).click();

		
		PageObjectClass.dodClick(driver).click();
		
		//SignUp.timeHr(driver).click();
	
		PageObjectClass.settimeHr(driver);
		
	
		
		//SignUp.timeMin(driver).click();
		PageObjectClass.settimeMin(driver); 
		
		
		PageObjectClass.mobile(driver).sendKeys("2379948338");
		
		PageObjectClass.course(driver).click();

		PageObjectClass.query(driver).sendKeys("What is the duration of course.");
		
		PageObjectClass.verificationCode(driver).sendKeys("30"); //wrong verification code
		
		PageObjectClass.submit(driver).click(); 
		
		String PgTitle = driver.getTitle(); 
		
		String expPgTitle = "Demo Site – Dynamic Transaction – NxtGen A.I Academy";
		
		if(PgTitle.contentEquals(expPgTitle)) {
			System.out.println("incorrectverificationCodeTest testcase : Fail");
		}
		else {
			System.out.println("incorrectverificationCodeTest testcase : Pass");
		}
  } 
}
