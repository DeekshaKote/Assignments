package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landingpage {
	
	static WebDriver driver;
	 boolean res;
	//constructor 
	 public Landingpage (WebDriver driver) {
		 this.driver=driver;

	 }
	 By flashsuccess =By.xpath("//*[@class=\"flashsuccess\"]");
	 public boolean isloginSuccess()
	 {
		
		 try {
			 driver.findElement(flashsuccess);
			 res=true;
		 }
		 catch (NoSuchElementException n)
		 {
			 res=false;
		 }
		return res;
	 }
	 
	
}
