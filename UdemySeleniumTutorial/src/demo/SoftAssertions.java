/**
 * 
 */
package demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

/**
 * @author Naduni
 *
 */
public class SoftAssertions {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException, IOException {
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class*='gf-li'] a"));
		
		SoftAssert a = new SoftAssert();
		
		for(WebElement link:links) {
		String url = link.getAttribute("href");	
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		System.out.println(conn.getResponseCode());
		//Assert.assertTrue(conn.getResponseCode()<400,link.getText() +" - "+conn.getResponseCode());
			a.assertTrue(conn.getResponseCode()<400,link.getText() +" - "+conn.getResponseCode());
		
		}
		// driver.findElement(By.xpath(""));	
		
		driver.close();
		driver.quit();
		a.assertAll();
	}

}
