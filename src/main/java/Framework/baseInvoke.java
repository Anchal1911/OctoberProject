package Framework;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class baseInvoke {
	
	public static WebDriver driver=null;
	public Properties prop;
	
	@Test
	public WebDriver base() throws IOException{
		
	
	 prop=new Properties();
	FileInputStream fis=new FileInputStream("F:\\Selenium\\E2EProject\\BaseData.properties");
	prop.load(fis);
	
	String browsername= prop.getProperty("Browser");
	if (browsername.equalsIgnoreCase("Chrome"))
			{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		 driver=new ChromeDriver(options);
			}
	else 
	{
		
		System.setProperty("webdriver.ie.driver", "F:\\Selenium\\IEDriverServer_x64_3.150.1\\IEDriverServer");
		 driver=new InternetExplorerDriver();
	}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}
	
	
	
	/*public void captureScreenshot(String nameoftestcase)throws IOException {
		
TakesScreenshot ts=(TakesScreenshot)driver ;//typecasting and forcefully creating object of an interface
		
		File source= ts.getScreenshotAs(OutputType.FILE);//method to capture screenshot in terms of files in memory ,in buffer
	
	FileUtils.copyFile(source,new File("F:/Selenium/screenshot/"+nameoftestcase+".png"));
		
		
		
	}*/
}
