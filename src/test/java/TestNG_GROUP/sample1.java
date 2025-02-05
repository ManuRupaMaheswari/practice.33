package TestNG_GROUP;

import org.testng.annotations.Test;

public class sample1 {
	@Test
	public void sample111(){
		System.out.println("hii sample1");
	}
	@Test(groups="smoke")
	public void sample11() { 
		System.out.println("hii sample11");
	}

}
