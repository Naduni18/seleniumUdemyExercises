/**
 * 
 */
package UdemyTutorial.SeleniumFramework;

import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import pageObjects.ForgotPasswordPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

/**
 * @author Naduni
 *
 */
public class HomePage extends Base {
	
	 public static Logger log =LogManager.getLogger(Base.class.getName());
	 public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("initialization is successful");
	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String email, String password, String testCase) {

		LandingPage l = new LandingPage(driver);	
		LoginPage lp = l.getLogin();
		lp.getEmail().sendKeys(email);
		lp.getPassword().sendKeys(password);
		lp.getLogin();
		
		ForgotPasswordPage fpp = lp.getFogotPassword();
		fpp.getEmail().sendKeys("18naduni@gmail.com");
		fpp.getsendMeInstructionsBtn().click();
	    log.info(testCase);

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		log.info("finish");
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][3];

		data[0][0] = "18naduni@gmail.com";
		data[0][1] = "redberry*7";
		data[0][2] = "invalid email,invalid password";
		return data;

	}
}
