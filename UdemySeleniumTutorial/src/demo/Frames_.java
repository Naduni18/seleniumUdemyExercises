/**
 * 
 */
package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Naduni
 *
 */
public class Frames_ {
	public static void main(String[] args) throws InterruptedException {
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		
		driver.get("https://jqueryui.com/droppable/");
		//driver.findElement(By.xpath(""));
		System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		//driver.findElement(By.id("draggable")).click();
		//drag drop
		Actions a = new Actions(driver);
		a.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
		driver.switchTo().defaultContent();
		driver.close();
		driver.quit();
	}	
}
//draggable droppable