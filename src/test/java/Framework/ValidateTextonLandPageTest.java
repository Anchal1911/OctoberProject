package Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ValidateTextonLandPageTest extends baseInvoke {
	public static Logger log=LogManager.getLogger(ValidateTextonLandPageTest.class.getName());
	
	@BeforeTest
	public void invoke() throws IOException {
		driver=base();
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test
	public void navigate() throws IOException {
		
		
		Landingpage obj=new Landingpage(driver);
		Assert.assertEquals(obj.validatetext().getText(),"FEATURED COURSES123");
		log.info(obj.validatetext().getText());
		
		//driver.navigate().back();
		//Loginpage object=new Loginpage(driver);
		
		
	}
	@AfterTest
       public void closebrowser() {
    	   driver.close();
    	   driver=null;
       }
		
	}
	

