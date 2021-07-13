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
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\geckodriver.exe");	   
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	   

		driver.close();
};

}
