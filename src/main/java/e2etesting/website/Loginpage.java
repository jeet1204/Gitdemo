package e2etesting.website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	WebDriver driver;
	By username=By.id("user_email");
	By password=By.id("user_password");
	By login=By.xpath("//input[@type='submit']");
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement user()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public void login()
	{
		driver.findElement(login).click();
	}

}
