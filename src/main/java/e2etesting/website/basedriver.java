package e2etesting.website;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basedriver 
{
	public WebDriver driver;
	Properties pro=new Properties();
	public WebDriver base() throws IOException
	{
		
		//FileInputStream fi=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\website\\src\\main\\java\\e2etesting\\website\\browser.properties");
		//pro.load(fi);
		String browsername=System.getProperty("browser");
		//String browsername=pro.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
		
		
	}
	public void screenshot() throws IOException
	{
		TakesScreenshot scr=(TakesScreenshot)driver;
		File screen=scr.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\admin\\eclipse-workspace\\website\\test.jpg");
		FileUtils.copyFile(screen, dest);
	}
}
