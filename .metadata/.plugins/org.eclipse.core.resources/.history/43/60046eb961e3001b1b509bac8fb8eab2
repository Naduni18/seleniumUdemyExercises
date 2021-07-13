/**
 * 
 */
package UdemyTutorial.SeleniumFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;

/**
 * @author Naduni
 *
 */
public class ValidateNavigationBar extends Base {
	 public static Logger log =LogManager.getLogger(Base.class.getName());
	 public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void basePageNavigation() throws IOException {

		LandingPage l = new LandingPage(driver);
		AssertJUnit.assertTrue(l.getNavBar().isDisplayed());
		 log.debug("success");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
