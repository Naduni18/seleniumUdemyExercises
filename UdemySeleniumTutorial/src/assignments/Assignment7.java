/**
 * 
 */
package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

/**
 * @author Naduni
 *
 */
public class Assignment7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String ss = "ireland";
		driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ire");
		int n = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div")).size();
		Actions a = new Actions(driver);
		List <WebElement> dd= driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));

		for(int i=0;i<n;i++) {
		
			if(dd.get(i).getText()==ss) {
				a.moveToElement(driver.findElement(By.xpath("//input[@id='autocomplete']"))).keyDown(Keys.ARROW_DOWN);
				break;
			}
		}
		
		String s = driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value");
		System.out.println(s);
		Assert.assertEquals(s, ss);
		driver.close();
		driver.quit();
	}
}
