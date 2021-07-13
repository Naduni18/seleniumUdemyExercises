/**
 * 
 */
package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Naduni
 *
 */
public class CookiesWindows {
	public static void main(String[] args) throws InterruptedException {
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("mycookie");//ex- session cookie with the login detais
		
		driver.get("https://www.amazon.com/");
		
		
		
		
		driver.close();
		driver.quit();
	}	
}
