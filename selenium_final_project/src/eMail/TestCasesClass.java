package eMail;



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
  public void correcteMail() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.eMail(driver).sendKeys("selenium@gmail.com");
		

  }
  
  @Test
  public void incorrecteMail1() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.eMail(driver).sendKeys("selenium");
		
		Actions a = new Actions(driver);
		a.keyDown(Keys.ENTER).perform();
		
		
		WebElement error = driver.findElement(By.xpath("//input[@id='vfb-14']//following::label"));
		String errmsg = error.getText();
		
		String experrmsg = "Please enter a valid email address.";
		
		if(errmsg.contentEquals(experrmsg)) {
			System.out.println("incorrecteMail1 testcase : Pass");
		}
		else {
			System.out.println("incorrecteMail1 testcase : Fail");
			
		}
		

  }
  @Test
  public void incorrecteMail2() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.eMail(driver).sendKeys("selenium@gmail");
		Actions a = new Actions(driver);
		a.keyDown(Keys.ENTER).perform();
		
		WebElement error = driver.findElement(By.xpath("//input[@id='vfb-14']//following::label"));
		String errmsg = error.getText();
		String experrmsg = "Please enter a valid email address.";
		
		if(errmsg.contentEquals(experrmsg)) {
			System.out.println("incorrecteMail2 testcase : Pass");
		}
		else {
			System.out.println("incorrecteMail2 testcase : Fail");
			
		}
		

  }
  @Test
  public void incorrecteMail3() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.eMail(driver).sendKeys(".com");
		
		Actions a = new Actions(driver);
		a.keyDown(Keys.ENTER).perform();
		
		WebElement error = driver.findElement(By.xpath("//input[@id='vfb-14']//following::label"));
		String errmsg = error.getText();
		String experrmsg = "Please enter a valid email address.";
		
		if(errmsg.contentEquals(experrmsg)) {
			System.out.println("incorrecteMail3 testcase : Pass");
		}
		else {
			System.out.println("incorrecteMail3 testcase : Fail");
			
		}
		

  }
  

}
