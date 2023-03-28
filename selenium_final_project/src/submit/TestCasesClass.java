package submit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class TestCasesClass {
	
	
	 @Test
	  public void SubmitTest() {
		  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver= new ChromeDriver(options); 
			
			driver.manage().window().maximize();
			driver.get("https://nxtgenaiacademy.com/demo-site/");
			
			PageObjectClass.submit(driver).click();
			
	 }
			
			
  @Test
  public void correctSubmitTest() {
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
			System.out.println("correctSubmitTest testcase : Pass");
		}
		else {
			System.out.println("correctSubmitTest testcase : Fail");
		}
  }
  
  @Test
  public void ftNamesubmitTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.submit(driver).click(); 
	
		
		//driver.findElement(By.id("vfb-5")).sendKeys("");
		
		
		WebElement error = driver.findElement(By.xpath("//input[@id='vfb-5']//following-sibling::label"));
		String errmsg = error.getText();

		String experrmsg = "This field is required.";
		
		if(errmsg.contentEquals(experrmsg)) {
			System.out.println("ftNamesubmitTest testcase : Pass");
		}
		else {
			System.out.println("ftNamesubmitTest testcase : Fail");
			
		}
		
  }
  
  @Test
  public void ltNamesubmitTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.firstName(driver).sendKeys("Byna");
		
		PageObjectClass.submit(driver).click();
		
		
		WebElement error = driver.findElement(By.xpath("//input[@id='vfb-7']//following-sibling::label"));
		String errmsg = error.getText();

		String experrmsg = "This field is required.";
		
		if(errmsg.contentEquals(experrmsg)) {
			System.out.println("ltNamesubmitTest testcase : Pass");
		}
		else {
			System.out.println("ltNamesubmitTest testcase : Fail");
			
		}
		
  }
  
  @Test
  public void gendersubmitTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.firstName(driver).sendKeys("Byna");
		PageObjectClass.lastName(driver).sendKeys("Srivastav");

		
		PageObjectClass.submit(driver).click();
		
		
		WebElement error = driver.findElement(By.xpath("//label[@for='vfb-31']"));
		String errmsg = error.getText();

		String experrmsg = "This field is required.";
		
		if(errmsg.contentEquals(experrmsg)) {
			System.out.println("gendersubmitTest testcase : Pass");
		}
		else {
			System.out.println("gendersubmitTest testcase : Fail");
			
		}
		
  }

  
  @Test
  public void eMailsubmitTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.firstName(driver).sendKeys("Byna");
		PageObjectClass.lastName(driver).sendKeys("Srivastav");

		PageObjectClass.gender(driver).click();
		
		PageObjectClass.submit(driver).click();
		
		
		WebElement error = driver.findElement(By.xpath("//input[@id='vfb-14']//following-sibling::label"));
		String errmsg = error.getText();

		String experrmsg = "This field is required.";
		
		if(errmsg.contentEquals(experrmsg)) {
			System.out.println("eMailsubmitTest testcase : Pass");
		}
		else {
			System.out.println("eMailsubmitTest testcase : Fail");
			
		}
		
  }
  
  @Test
  public void verificationsubmitTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.firstName(driver).sendKeys("Byna");
		PageObjectClass.lastName(driver).sendKeys("Srivastav");

		PageObjectClass.gender(driver).click();
		
		PageObjectClass.eMail(driver).sendKeys("selenium@gmail.com");
		
		PageObjectClass.submit(driver).click();
		
		
		WebElement error = driver.findElement(By.xpath("//input[@id='vfb-3']//following-sibling::label"));
		String errmsg = error.getText();

		String experrmsg = "This field is required.";
		
		if(errmsg.contentEquals(experrmsg)) {
			System.out.println("verificationsubmitTest testcase : Pass");
		}
		else {
			System.out.println("verificationsubmitTest testcase : Fail");
			
		}
		
  }
  
  @Test
  public void VerificationFailSubmitTest() {
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
		
		PageObjectClass.verificationCode(driver).sendKeys("45"); //wrong verification code
		
		PageObjectClass.submit(driver).click(); 
		
		String PgTitle = driver.getTitle(); 
		
		String expPgTitle = "Demo Site – Dynamic Transaction – NxtGen A.I Academy";
		
		if(PgTitle.contentEquals(expPgTitle)) {
			System.out.println("VerificationFailSubmitTest testcase : Fail");
		}
		else {
			System.out.println("VerificationFailSubmitTest testcase : Pass");
		}
  } 

}