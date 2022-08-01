package e2etesting.website;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testcase extends basedriver {
	public WebDriver driver;
	
	@Test(dataProvider="dataprovider")
	public void launch(String username, String password) throws IOException
	{
		driver=base();
		driver.get("http://www.qaclickacademy.com/");
		
		Homepage h=new Homepage(driver);
		h.remove();
		h.login();
		Loginpage l =new Loginpage(driver);
		l.user().sendKeys(username);
		l.password().sendKeys(password);
		l.login();
	}

	@DataProvider(name="dataprovider")
	public String[][] getdata()
	{
		String[][] data= new String[2][2];
		data[0][0]="abc";
		data[0][1]="user";
		data[1][0]="xyz";
		data[1][1]="user2";
		return data;
		
	}
	
}

