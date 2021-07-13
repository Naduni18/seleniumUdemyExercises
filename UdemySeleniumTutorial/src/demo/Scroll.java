/**
 * 
 */
package demo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * @author Naduni
 *
 */
public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
			WebDriver driver = new ChromeDriver();
		//WebDriverWait w = new WebDriverWait(driver,30);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// driver.findElement(By.xpath(""));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=1000");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		int sum = 0;
		for(int i=0;i<list.size();i++) {
		sum=sum+Integer.parseInt(list.get(i).getText());
		}
		String[] arr = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(" ");
		int a = Integer.parseInt(arr[3]);
		Assert.assertEquals(sum,a);
		System.out.println(sum);
		
		driver.close();
		driver.quit();
	}
}
