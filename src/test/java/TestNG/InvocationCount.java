package TestNG;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(priority=-1)
	public void createcontact() {
		System.out.println("contact created");
	}

	@Test(priority=0)
	public void modifycontact() {
		System.out.println("contact modified");
	}
	
	@Test(invocationCount = 2,priority=1)
	public void deletecontact() {
		System.out.println("delete contact");
	}

}
