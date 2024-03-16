package projectOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyClass { 
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	
	public void MyBeforeTest () throws InterruptedException {
		String myURL ="https://www.saucedemo.com/";

		driver.get(myURL);
	
	}
	
	
     @Test
	public void CheckTheWebsiteTitle() throws InterruptedException {
    	 
    	 
    WebElement UserName	 =driver.findElement(By.id("user-name"));
    WebElement Password	=driver.findElement(By.id("password"));
    WebElement LoginButton= driver.findElement(By.id("login-button"));
    	 
    	 UserName.sendKeys("standard_user");
    	 Password .sendKeys("secret_sauce");
    	 LoginButton .click();
    	 WebElement firstItemAddtoCartButton=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    	 firstItemAddtoCartButton.click();
    	 
    	 
	}

}
