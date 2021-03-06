/**
 * 
 */
package udemyTutorials.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

/**
 * @author Naduni
 *
 */
public class Demo {
	String currentDirectory = System.getProperty("user.dir");
	ExtentReports er;
	@BeforeTest
	public void config() {
		String path_ = currentDirectory+"//testResults//index.html";
		ExtentSparkReporter report_ = new ExtentSparkReporter(path_);
		report_.config().setReportName("web automation results");
		report_.config().setDocumentTitle("test results");
		
		er = new ExtentReports();
		er.attachReporter(report_);
		er.setSystemInfo("Tester", "Naduni");
	}
	
	
	@Test
	public void test1() {
		ExtentTest et = er.createTest("Demo test");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
		er.flush();
		
	}
}
