package e2etesting.website;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testcase2 extends basedriver {
	public WebDriver driver;
	@Test
	public void assertive() throws IOException
	{
	driver=base();
	driver.get("http://www.qaclickacademy.com/");
	Homepage h=new Homepage(driver);
	h.remove();
	Assert.assertEquals(h.text(), "FEATURED COURSS", "Mismatch");
	
	}
}


