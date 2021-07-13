/**
 * 
 */
package demo;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * @author Naduni
 *
 */
public class ScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException{
	String currentDirectory = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File(currentDirectory+"\\scrennshots\\s1.png"));
	// driver.findElement(By.xpath(""));	
	driver.close();
	driver.quit();
}
}
