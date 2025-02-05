package TestNG;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=-1)
	public void createcontact() {
		System.out.println("contact created");
	}

	@Test(priority=0)
	public void modifycontact() {
		System.out.println("contact modified");
	}
	
	@Test(priority=1)
	public void deletecontact() {
		System.out.println("delete contact");
	}
}
