package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Landingpage {
	
	
	WebDriver driver;
	
	public  Landingpage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	By login=By.cssSelector("a[href*='sign_in']");
	By validtext=By.cssSelector("#content div div h2");
	By tab=By.cssSelector(".nav.navbar-nav.navbar-right");
	@Test
	public WebElement signin()
	{
		return driver.findElement(login);
}
	
	@Test
	public WebElement validatetext() {
		
		return driver.findElement(validtext);
	}
	@Test
	public WebElement navigatetab() {
		
		return driver.findElement(tab);
	}
	
}
