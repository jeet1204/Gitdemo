package e2etesting.website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreport {
	static ExtentReports rep;
	public static ExtentReports configs()
	{
		String file=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter ext=new ExtentSparkReporter(file);
		ext.config().setReportName("My Automtion report");
		ext.config().setDocumentTitle("Results");
		
		rep=new ExtentReports();
		rep.attachReporter(ext);
		rep.setSystemInfo("Tester", "Jeet Parikh");
		return rep;
	}
	

}
