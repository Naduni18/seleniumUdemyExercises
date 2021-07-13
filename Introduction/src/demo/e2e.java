/**
 * 
 */
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * @author Naduni
 *
 */
public class e2e {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//driver.findElement(By.xpath(""));
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("0.5"));
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")).click();
		driver.findElement(By.xpath("//option[@value='3']")).click();
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency'] //option[@value='USD']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		Thread.sleep(2000L);
		Assert.assertEquals(driver.getCurrentUrl(),"https://book.spicejet.com/Select.aspx");
		driver.close();
		driver.quit();
	}	
}
//ctl00_mainContent_ddl_originStation1_CTXT
//ctl00_mainContent_ddl_destinationStation1_CTXT
//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
//ui-state-default ui-state-highlight ui-state-active
//divpaxinfo
//ctl00_mainContent_ddl_Adult
//ctl00_mainContent_DropDownListCurrency
//ctl00_mainContent_btn_FindFlights


















