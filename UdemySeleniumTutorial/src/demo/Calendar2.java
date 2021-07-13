/**
 * 
 */
package demo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Naduni
 *
 */
public class Calendar2 {
	static String  expectednum="12";
	public static void main(String[] args) throws InterruptedException {
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		//WebDriverWait w = new WebDriverWait(driver,30);
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		// driver.findElement(By.xpath(""));
		driver.findElement(By.id("travel_date")).click();
		
		while(!driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch")).getText().contains("July")) {
			driver.findElement(By.cssSelector(".datepicker-days .next")).click();
			
		}
		List<WebElement> li = driver.findElements(By.className("day"));
		int count = li.size();
		for(int i=0;i<count;i++) {
			String s =li.get(i).getText();
			System.out.println(s);
			if(s.equalsIgnoreCase("12")) {
				li.get(i).click();
				System.out.println(i);
				break;
			}
		
		}
		/*List<WebElement> li = driver.findElements(By.className("day"));
		int count = li.size();
		for(int i=0;i<count;i++) {
			if(li.get(i).getText()==expectednum) {
				li.get(i).click();
				System.out.println(count); }} */
			
		driver.close();
		driver.quit();
	}
}
