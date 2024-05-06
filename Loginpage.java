package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Loginpage {
	
	 static WebDriver driver;
	 boolean res;
	//constructor 
	 public Loginpage (WebDriver driver) {
		 this.driver=driver;
		 
		 }
	 //Element Reference
	 By username= By.id("username");
	 By password= By.id("password");
	 By loginbtn= By.cssSelector("#login > button > i");
	 By footer= By.partialLinkText("Selenium");
	 
	 //methods
	 
	 public boolean chkTitle(String exp_title)
		{
			String act_title = driver.getTitle();
			res = (act_title.equals(exp_title)) ? true:false;
			
			return res;
		}
		
		public void fillUsername(String s)
		{
			driver.findElement(username).sendKeys(s);
		}
		
		public void fillPassword(String p)
		{
			driver.findElement(password).sendKeys(p);
		}
		
		public void clickLoginBtn()
		{
			driver.findElement(loginbtn).click();
			
		}
		
		//method to check if page loaded fully
		public boolean chkPageFooter()
		{
			try {
					driver.findElement(footer);
					res=true;
			}
			catch (NoSuchElementException e)
			{
				res=false;
			}

			return res;
		}
		
	// A method to check if password is a password not showing characters
		
		public boolean isPasswordMasked()
		{
			
			String masked = driver.findElement(password).getAttribute("type");
		
		    res=masked.equals("password") ? true : false;
		    
		    return res;
		}
	 
	 
	 
	 

}
