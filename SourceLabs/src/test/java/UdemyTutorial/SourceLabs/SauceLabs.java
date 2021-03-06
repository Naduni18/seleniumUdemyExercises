/**
 * 
 */
package UdemyTutorial.SourceLabs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

/**
 * @author Naduni
 *
 */
public class SauceLabs {
	String currentDirectory = System.getProperty("user.dir");

	  public static final String USERNAME = "18naduni-38b5c";
	  public static final String ACCESS_KEY = "3a6d1d52-bea6-4b5a-b099-b4c172c71600";
	//  public static final String URL_ = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	  public static final String URL_ = "https://oauth-18naduni-38b5c:3a6d1d52-bea6-4b5a-b099-b4c172c71600@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
	@Test
	public void demoMethod() throws InterruptedException, MalformedURLException {

		
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("screenResolution", "800x600");
		

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("platformName", "Windows 8.1");
		browserOptions.setCapability("browserVersion", "91.0");
		browserOptions.setCapability("extendedDebugging",true);
		browserOptions.setCapability("capturePerformance",true);
		browserOptions.setCapability("sauce:options", sauceOptions);
		
		
		

		WebDriver driver = new RemoteWebDriver(new URL(URL_), browserOptions);
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.close();
		driver.quit();
	}

}
