/**
 * 
 */
package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.HomePageObjectsFactory;
import objectRepository.LoginPageObjectsFactory;

/**
 * @author Naduni
 *
 */
public class LoginPageTest2 {
	
	@Test
	public void Login() throws InterruptedException {
	String currentDirectory = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	LoginPageObjectsFactory lpo = new LoginPageObjectsFactory(driver);
	
	lpo.getEmailInputBox().sendKeys("asdafsd");
	lpo.getPasswordInputBox().sendKeys("safsd");
	lpo.getSubmitBtn().click();
	
	lpo.getHomePageLink().click();
	
	HomePageObjectsFactory hpo = new HomePageObjectsFactory(driver);
	
	hpo.getSearchBox().sendKeys("hello");
	hpo.getSearchBtn().click();
	
	Thread.sleep(2000L);
	driver.close();
	driver.quit();
	
}
}
