package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Homepage {
	boolean res;
	
	
	static WebDriver driver;
	//constructor
	 public Homepage (WebDriver driver) {
		 this.driver=driver;
		 
		 }
	 //Elements
	 By Icon= By.id("menuSearch");
	 By Searchbar= By.id("autoComplete");
	 By Items=By.xpath("//*[contains(@class,\"titleItemsCount\")]//parent::p");
	 
	 
	//methods
	/* public boolean checkboxispresent()
		{
		
		 try {
			    
			    WebElement serachbox=driver.findElement(Searchbar);
			    System.out.println(serachbox);
			    res=true;
			    }
			    
			    catch(NoSuchElementException e){
			    	
			    	System.out.println("Serach box not found ");
			    	res=false;
			    	
			    }
			   
				return res;
			
		
		}*/
	 
	 public void clickLense()
		{
		 driver.findElement(Icon).click();
		
			
		}
	 public void entersearchword(String s)
		{
		 driver.findElement(Searchbar).sendKeys(s+ Keys.ENTER);
		
			
		}
	 
	 public boolean checkSerachResult() {
	 try {
		    
		    String Howmany=driver.findElement(Items).getText();
		    System.out.println(Howmany);
		    res=true;
		    }
		    
		    catch(NoSuchElementException e){
		    	
		    	
		    	res=false;
		    	
		    }
		    
			return res;
	 
	 }
}
