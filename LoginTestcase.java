package Testcases;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.Landingpage;
import Pages.Loginpage;
import Utils.OpenBrowser;

public class LoginTestcase {
	static WebDriver driver;
	static Loginpage lp;
	static Landingpage landingpage;
	boolean res;
	
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
		driver.get("https://the-internet.herokuapp.com/login");
		lp = new Loginpage(driver);
		landingpage = new Landingpage(driver);  	
	}
	
	
	@Test
  public void chkTitleOfLoginPage () {
	  
	 res= lp.chkTitle("The Internet");
	  
	Assert.assertEquals(true,res);  
  }
	@Test
	public void chkToSeeIfFooterIsThere ()
	{
		
		Assert.assertEquals(true, lp.chkPageFooter());
		
	}
	
	@Test
	public void chkToSeePasswordMasked()
	{
		Assert.assertEquals(true, lp.isPasswordMasked());
	}
	
	@Test
	public void doLogin()
	{
		lp.fillUsername("tomsmith");
		lp.fillPassword("SuperSecretPassword!");
		lp.clickLoginBtn();
		
		Assert.assertEquals(true,landingpage.isloginSuccess());
		
	}
	@Test
	public void doLoginNegativeSecurity()
	{
		lp.fillUsername("tomsmith");
		lp.fillPassword("SuperSPassword!");
		lp.clickLoginBtn();
		
		Assert.assertEquals(false,landingpage.isloginSuccess());
		
	}
}
