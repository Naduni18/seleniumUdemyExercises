/**
 * 
 */
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Naduni
 *
 */
public class CaptureHightWidthOfWebElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {String currentDirectory = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
	WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/angularpractice/");// TODO Auto-generated method stub
    WebElement ele = driver.findElement(By.xpath("//input[@name='name']"));
    
   int h =  ele.getRect().getDimension().height;
   int w = ele.getRect().getDimension().width;
   System.out.println(h+" x "+w);
    driver.close();
	driver.quit();
	}

}
