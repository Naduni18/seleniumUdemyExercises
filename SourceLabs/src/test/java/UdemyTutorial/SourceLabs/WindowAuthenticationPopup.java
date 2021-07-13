/**
 * 
 */
package UdemyTutorial.SourceLabs;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Naduni
 *
 */
public class WindowAuthenticationPopup {
	String currentDirectory = System.getProperty("user.dir");

	@Test
	public void demoMethod() throws InterruptedException, MalformedURLException {

		System.setProperty("webdriver.chrome.driver", currentDirectory + "\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		//https://username:password@url
		driver.findElement(By.xpath("//a[contains(@href,'basic_auth')]")).click();
		
		
		Thread.sleep(1000);
		driver.close();
		driver.quit();
	}
}
//https://the-internet.herokuapp.com/basic_auth