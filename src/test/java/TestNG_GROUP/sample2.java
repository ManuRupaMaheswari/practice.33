package TestNG_GROUP;

import org.testng.annotations.Test;

public class sample2 {
	@Test(groups="smoke")
	public void sample222() {
		System.out.println("hii sample222");
	}
	@Test
	public void sample22() {
		System.out.println("hii sample22");
	}

}
