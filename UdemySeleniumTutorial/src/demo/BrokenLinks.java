/**
 * 
 */
package demo;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * @author Naduni
 *
 */
public class BrokenLinks {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws 
	 */
	//response codes bigger than 400 are errors
	public static void main(String[] args) throws IOException{
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class*='gf-li'] a"));
		for(WebElement link:links) {
		String url = link.getAttribute("href");	
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		if(conn.getResponseCode()>400) {
			System.out.println(link.getText() +" - "+conn.getResponseCode());
			Assert.assertTrue(false);
			
		}
		}
		// driver.findElement(By.xpath(""));	
		driver.close();
		driver.quit();
	}

}
