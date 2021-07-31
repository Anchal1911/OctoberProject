package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Loginpage {
	WebDriver driver;
		
		public  Loginpage(WebDriver driver) {
			
			this.driver=driver;
			
		}
		
		By email=By.cssSelector("input[type*='email']");
		By password =By.cssSelector("input[type*='password']");
	    By submit= By.cssSelector("input[value*='Log In']");
	    
		@Test
		public WebElement emailid()
		{
			return driver.findElement(email);
	}
		@Test
		public WebElement passwordname()
		{
			return driver.findElement(password);
	}
		@Test
		public WebElement submitbutton()
		{
			return driver.findElement(submit);
	}
		
	}


