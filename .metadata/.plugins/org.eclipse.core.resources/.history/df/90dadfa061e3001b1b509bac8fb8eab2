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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;

/**
 * @author Naduni
 *
 */
public class ValidateTitle extends Base {
	 public static Logger log =LogManager.getLogger(Base.class.getName());
	 public WebDriver driver;
	 public static LandingPage l;
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void validateTitle() throws IOException {

		l = new LandingPage(driver);
		AssertJUnit.assertEquals("FEATURED COURSES",l.getTitle().getText());
		
		 log.info("validate title");

	}
	
/*	@Test
	public void validateSubHeader() throws IOException {

		AssertJUnit.assertEquals("Learn Hot tools like Selenium, Appium, JMeter, SoapUI,Database Testing and more..",l.getSubHeader().getText() );
		 log.info("validate sub header");

	} */

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

	
}
