/**
 * 
 */
package demo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.util.Strings;

/**
 * @author Naduni
 *
 */
public class WebTableSort {
	
	public static void main(String[] args){
		
	String currentDirectory = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	driver.findElement(By.xpath("//th[1]")).click();
	List<WebElement> original = driver.findElements(By.xpath("//tbody/tr/td[1]"));
	List<String> originallist = original.stream().map(s->s.getText()).collect(Collectors.toList());
	List<String> sortedlist = originallist.stream().sorted().collect(Collectors.toList());
	Assert.assertTrue(originallist.equals(sortedlist));
	driver.close();
	driver.quit();
}
}
//tbody/tr/td[1]