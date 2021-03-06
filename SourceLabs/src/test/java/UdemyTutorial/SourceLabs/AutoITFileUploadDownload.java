/**
 * 
 */
package UdemyTutorial.SourceLabs;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * @author Naduni
 *
 */

public class AutoITFileUploadDownload {
	String currentDirectory = System.getProperty("user.dir");

	@Test
	public void demoMethod() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", currentDirectory + "\\browserdrivers\\chromedriver.exe");
		ChromeOptions cp = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", currentDirectory + "\\AutoITScripts\\");
		cp.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver = new ChromeDriver();
		driver.get("https://altoconvertpdftojpg.com/");
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//button[@id='dropzoneInput-label']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec( currentDirectory + "\\AutoITScripts\\fileupload.exe");
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Convert Now!')]")));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Convert Now!')]")).getText());
		
		driver.findElement(By.xpath("//button[contains(text(),'Convert Now!')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Download')]")));
		String filenamenew = driver.findElement(By.xpath("//p[@class='output-result-text__file-name']")).getText();
		System.out.println(filenamenew);
		driver.findElement(By.xpath("//a[contains(text(),'Download')]")).click();
		Thread.sleep(5000);
		File f = new File(currentDirectory + "\\AutoITScripts\\Result.zip");
		if(f.exists()) {
			System.out.println("file downloaded correctly");
		}
		//driver.close();
		//driver.quit();
	}
}

//span[text()='Convert']/parent::div/parent::button
//a[contains(text(),'Download')]
//p[@class='output-result-text__file-name']