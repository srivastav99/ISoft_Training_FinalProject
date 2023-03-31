package setTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCasesClasssetTime {
	
  @Test (priority = 1)
  
  public void setTimeByClick() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.dodClick(driver).click();
		
		PageObjectClass.settimeHr(driver);
		PageObjectClass.settimeMin(driver);
		
		driver.close();
		
  }
  
  
  @Test (priority = 2)
  public void correctsetTimeByText() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		PageObjectClass.dodClick(driver).click();
		
		Actions a = new Actions(driver);
		  a.keyDown(Keys.TAB).perform();
		  a.keyDown(Keys.ENTER).perform();
		
		PageObjectClass.settimeHrText(driver).sendKeys("9");
		
		a.keyDown(Keys.ENTER).perform();  
		a.keyDown(Keys.TAB).perform();
		a.keyDown(Keys.ENTER).perform();  
		  
		PageObjectClass.settimeMinText(driver).sendKeys("45");
		
		a.keyDown(Keys.ENTER).perform(); 
		
		driver.close();
  }		

  
	@Test (priority = 3)
	public void incorrectsetTimeByTextHr() {
			  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver= new ChromeDriver(options); 
				
				driver.manage().window().maximize();
				driver.get("https://nxtgenaiacademy.com/demo-site/");
				
				PageObjectClass.dodClick(driver).click();
				
				Actions a = new Actions(driver);
				  a.keyDown(Keys.TAB).perform();
				  a.keyDown(Keys.ENTER).perform();
				
				PageObjectClass.settimeHrText(driver).sendKeys("45");
				
				a.keyDown(Keys.ENTER).perform();  
				
				WebElement msg = driver.findElement(By.xpath("//li[@role='alert']"));
				
				String msgText = msg.getText();
				
				String expmsgText = "No results found";
				
				if(msgText.contentEquals(expmsgText)){
					
					System.out.println("incorrectdodByTextHr : Pass");
				}
				else {
					System.out.println("incorrectdodByTextHr : Fail");
				}
				
				driver.close();
	
		
  }
  

  
	@Test (priority = 4)
	public void incorrectsetTimeByTextMin() {
			  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver= new ChromeDriver(options); 
				
				driver.manage().window().maximize();
				driver.get("https://nxtgenaiacademy.com/demo-site/");
				
				PageObjectClass.dodClick(driver).click();
				
				Actions a = new Actions(driver);
				  a.keyDown(Keys.TAB).perform();
				  a.keyDown(Keys.TAB).perform();
				  a.keyDown(Keys.ENTER).perform();
				
				PageObjectClass.settimeMinText(driver).sendKeys("75");
				
				a.keyDown(Keys.ENTER).perform();  
				
				WebElement msg = driver.findElement(By.xpath("//li[@role='alert']"));
				
				String msgText = msg.getText();
				
				String expmsgText = "No results found";
				
				if(msgText.contentEquals(expmsgText)){
					
					System.out.println("incorrectdodByTextMin : Pass");
				}
				else {
					System.out.println("incorrectdodByTextMin : Fail");
				}
				
				driver.close();
  }
  

}
