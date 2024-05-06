package Testcases;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.Homepage;

import Utils.OpenBrowser;


public class advdemoTestcase {
	
	static WebDriver driver;
	static Homepage hp;
	public boolean res;
	String s="mouse";

	
	@AfterClass
	public void closeDriver()
	{
		
		driver.quit();
	}
	@BeforeClass
	public void initDriver()
	{
		
		OpenBrowser ob = new OpenBrowser();
		
		driver = ob.openChrome();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
		hp = new Homepage (driver);
		
	}
  /*@Test (priority=4)
  public void checkbox() {
	  
	  
	  Assert.assertEquals(true,hp.checkboxispresent());  
  }*/
  @Test(priority=3)
  public void checkResult() {
	  
	  Assert.assertEquals(true,hp.checkSerachResult());  
  }
  
  @Test(priority=1)
  public void ClickSerachbar() {
	  hp.clickLense(); 
	  
  }
  
  @Test(priority=2)
  public void enterSearchWord() {
	  
	 hp.entersearchword(s);
	  
  }
  
}
