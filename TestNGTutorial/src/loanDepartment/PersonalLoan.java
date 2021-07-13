/**
 * 
 */
package loanDepartment;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Naduni
 *
 */
public class PersonalLoan {
	@Test(groups = {"smoke"})
	public void login() {
		System.out.println("PersonalLoan login");
	}
	@Test(enabled=false)
	public void mobile_login() {
		System.out.println("PersonalLoan mobile login");
	}
	
	@Test
	public void logout() {
		System.out.println("PersonalLoan logout");
	}
	
	@Test
	public void mobile_logout() {
		System.out.println("PersonalLoan mobile logout");
	}
	
	@Test
	public void apply() {
		System.out.println("PersonalLoan apply");
	}
	
	@Test(dependsOnMethods = {"PersonalLoan.login","PersonalLoan.apply"})
	public void reject() {
		System.out.println("PersonalLoan reject");
	}
	@Parameters({"URL","URL2"})
	@Test
	public void approve(String url , String url2) {
		System.out.println("PersonalLoan approve \n"+url +"\n"+url2);
	}
	
	@Test(timeOut =1000)
	public void getClientDetails() {
		System.out.println("PersonalLoan client details get");
	}
	
	@Test
	public void setClientDetails() {
		System.out.println("PersonalLoan client details set");
	}
	
	@Test
	public void getLoanStatus() {
		System.out.println("PersonalLoan get loan status");
	}
	
	@Test
	public void setLoanStatus() {
		System.out.println("PersonalLoan set load status");
	}
	
	@Test
	public void sendOutstandingWarn() {
		System.out.println("PersonalLoan warning");
	}
	
	@Test
	public void setNewLoan() {
		System.out.println("PersonalLoan add new loan");
	}
	
	@Test
	public void removeLoan() {
		System.out.println("PersonalLoan delete loan");
	}
}
