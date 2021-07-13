/**
 * 
 */
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Naduni
 *
 */
public class Locators3 {
	//should be unique
		static long x = 10000;
		public static void main(String[] args) throws InterruptedException {
			String currentDirectory = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.findElement(By.cssSelector("#email")).sendKeys("asdfdf");
			driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("1233455678");
         //relative XPath is better
		//	relative - //*[@id=\'pass\']
		//  absolute - /html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input
	//because in future developers can add/remove elements to the page which may change the element hierarchy 	
			driver.close();
			driver.quit();
		}
}

