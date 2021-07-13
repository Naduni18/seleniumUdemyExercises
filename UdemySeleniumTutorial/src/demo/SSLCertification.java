/**
 * 
 */
package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author Naduni
 *
 */
public class SSLCertification {
	public static void main(String[] args) throws InterruptedException {
		
		//genaral chrome capabilities
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//local browser options
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver(c);
		//WebDriver driver = new ChromeDriver();
		
		driver.get("http://acchehr.site");
		
		
		driver.close();
		driver.quit();
	}
}
