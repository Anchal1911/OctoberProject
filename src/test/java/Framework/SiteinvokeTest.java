package Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SiteinvokeTest extends baseInvoke 
{
	//WebDriver driver;
	public static Logger log=LogManager.getLogger(SiteinvokeTest.class.getName());
	
	@Test(dataProvider="getdata")
	public void navigate(String username,String pass) throws IOException {
		
		driver=base();
		log.info("browser invoked succesfully");
		driver.get(prop.getProperty("url"));
		log.info("website launched succesfully");
		Landingpage obj=new Landingpage(driver);
		obj.signin().click();
		//driver.navigate().back();
		Loginpage object=new Loginpage(driver);
		
		
		object.emailid().sendKeys(username);
		object.passwordname().sendKeys(pass);
		object.submitbutton().click();
		driver.close();
	}
	
        @DataProvider		
		public Object[][] getdata()
		{
			Object[][] a=new Object[3][2];
			a[0][0]="restricted user";
			a[0][1]="restricedpass";
			
			a[1][0]="nonrestricted user";
			a[1][1]="nonrestrictpass";
			
			a[2][0]="real";
			a[2][1]="not real";
			return a;
			
		}
		
        
        
	}
	

