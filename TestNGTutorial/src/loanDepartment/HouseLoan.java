/**
 * 
 */
package loanDepartment;

import org.testng.annotations.Test;

/**
 * @author Naduni
 *
 */
public class HouseLoan {

	@Test(groups = {"smoke"})
	public void login() {
		System.out.println("HouseLoan login");
	}
	@Test
	public void mobile_login() {
		System.out.println("HouseLoan mobile login");
	}
	
	@Test
	public void logout() {
		System.out.println("HouseLoan logout");
	}
	
	@Test
	public void mobile_logout() {
		System.out.println("HouseLoan mobile logout");
	}
	
	@Test
	public void apply() {
		System.out.println("HouseLoan apply");
	}
	
	@Test
	public void reject() {
		System.out.println("HouseLoan reject");
	}
	
	@Test
	public void approve() {
		System.out.println("HouseLoan approve");
	}
	
	@Test
	public void getClientDetails() {
		System.out.println("HouseLoan client details get");
	}
	
	@Test
	public void setClientDetails() {
		System.out.println("HouseLoan client details set");
	}
	
	@Test
	public void getLoanStatus() {
		System.out.println("HouseLoan get loan status");
	}
	
	@Test
	public void setLoanStatus() {
		System.out.println("HouseLoan set load status");
	}
	
	@Test
	public void sendOutstandingWarn() {
		System.out.println("HouseLoan warning");
	}
	
	@Test
	public void setNewLoan() {
		System.out.println("HouseLoan add new loan");
	}
	
	@Test
	public void removeLoan() {
		System.out.println("HouseLoan delete loan");
	}
	
}
