package e2etesting.website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	WebDriver driver;
	By popup=By.xpath("//button[text()='NO THANKS']");
	By login=By.cssSelector("a[href*='sign_in']");
	By text=By.xpath("//div[@class='text-center']/h2"); 
	public Homepage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	public void remove()
	{
		driver.findElement(popup).click();
	}

	public void login()
	{
		driver.findElement(login).click();
	}
	
	public String text()
	{
		return driver.findElement(text).getText();
	}

}
