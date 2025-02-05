package TestNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void createcontact() {
		System.out.println("contact created");
	}

	@Test(dependsOnMethods = "createcontact")
	
	public void modifycontact() {
		System.out.println("contact modified");
	}
	
	@Test(dependsOnMethods = "createcontact")
	
	public void deletecontact() {
		System.out.println("delete contact");
	}

}
