package SmokeTest;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchButton {
boolean res;
	@Test
	public void checkSearchResults() {
		
		WebDriver driver; // declare webdriver instance
	   String srch="adf";
	    driver =new ChromeDriver(); // instantiate new firefox driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.advantageonlineshopping.com");
	    driver.manage().window().maximize();
	    
	    
	    
	    driver.findElement(By.id("menuSearch")).click();
	    
	    driver.findElement(By.id("autoComplete")).sendKeys(srch + Keys.ENTER);
	    
	    try {
	    
	    String Howmany=driver.findElement(By.xpath("//*[contains(@class,\"titleItemsCount\")]//parent::p")).getText();
	    System.out.println(Howmany);
	    res=true;
	    }
	    
	    catch(NoSuchElementException e){
	    	
	    	System.out.println("No results found for "+ srch);
	    	res=false;
	    	
	    }
	    Assert.assertEquals(true, res);
	    
	    
	    
	    
		
	}
}
