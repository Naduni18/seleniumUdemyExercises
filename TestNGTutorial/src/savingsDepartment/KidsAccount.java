package savingsDepartment;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class KidsAccount {
	@Test
	public void login() {
		System.out.println("kids Account login");
	}
	@Test
	public void mobile_login() {
		System.out.println("kids Account mobile login");
	}
	
	@Test(dependsOnMethods = {"savingsDepartment.login"})
	public void logout() {
		System.out.println("kids Account logout");
	}
	@Parameters({"URL","URL2"})
	@Test(groups = {"smoke"})
	public void mobile_logout(String url , String url2) {
		System.out.println("kids Account mobile logout \n"+url +"\n"+url2);
	}
	
	@BeforeTest
	public void beforeTestdo() {
		System.out.println("before test");
	}
	
	@BeforeSuite
	public void beforeSuitedo() {
		System.out.println("before suite");
	}
}
// all tests in a class are executed in alphabetical order 