/**
 * 
 */
package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Naduni
 *
 */
public class Demo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	//	System.out.println(driver.getPageSource());
		
		driver.get("https://www.yahoo.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		/*
		 * driver.navigate().back(); try { driver.wait(100000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl());
		 */
		
		driver.close();//close current browser window
	//	driver.quit();//close all browser windows
		
};

}
