/**
 * 
 */
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
/**
 * @author Naduni
 *
 */
public class RelativePath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement ele = driver.findElement(By.xpath("//input[@name='name']"));
		//driver.findElement(withTagName("lable").above(ele));//below,toLeftOf,toRightOf
		
		
		driver.close();
		driver.quit();
	}

}
