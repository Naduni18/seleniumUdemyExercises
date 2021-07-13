/**
 * 
 */
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Naduni
 *
 */
public class SiblingXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//input[@name='btnI']/following-sibling::input[1]")).click();
		driver.close();
		driver.quit();
	}
}
//sibling  relationship
//when parent and the target tag both doesn't have any static unique identifier - but one sibling has a static unique identifier

/* 
<div class="FPdoLc lJ9FBc">  
<center> 
<input class="gNO89b" value="Google Search" aria-label="Google Search" name="btnK" type="submit" data-ved="0ahUKEwiQ_ISmi5zxAhULbn0KHQhoB0IQ4dUDCAs"> 
<input class="RNmpXc" value="I'm Feeling Lucky" aria-label="I'm Feeling Lucky" name="btnI" type="submit" jsaction="trigger.kWlxhc" data-ved="0ahUKEwiQ_ISmi5zxAhULbn0KHQhoB0IQ19QECAw">  
</center> 
</div>
*/