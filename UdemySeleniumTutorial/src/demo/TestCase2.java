/**
 * 
 */
package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Naduni
 *
 */
public class TestCase2 {
	public static void main(String[] args) {
		
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	   

		driver.close();
};

}
