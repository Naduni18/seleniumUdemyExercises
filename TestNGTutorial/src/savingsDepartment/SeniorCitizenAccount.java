/**
 * 
 */
package savingsDepartment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Naduni
 *
 */
public class SeniorCitizenAccount {
	@Test
	public void login() {
		System.out.println("Senior Citizen Account login");
	}
	@Test
	public void mobile_login() {
		System.out.println("Senior Citizen Account mobile login");
	}
	@Parameters({"URL"})
	@Test
	public void logout(String url) {
		System.out.println("Senior Citizen Account logout \n" + url);
	}
	
	@Test(groups = {"smoke"})
	public void mobile_logout() {
		System.out.println("Senior Citizen Account mobile logout");
	}
	
	@AfterTest
	public void afterTestdo() {
		System.out.println("after test");
	}
	@AfterClass
	public void afterClassdo() {
		System.out.println("after class");
	}
	@AfterMethod
	public void afterMethoddo() {
		System.out.println("after method");
	}
}
