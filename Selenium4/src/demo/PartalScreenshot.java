/**
 * 
 */
package demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Naduni
 *
 */
public class PartalScreenshot {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement ele = driver.findElement(By.xpath("//input[@name='name']"));
		
		File file = ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("input.png"));
	

	}

}
