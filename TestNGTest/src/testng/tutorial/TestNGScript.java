package testng.tutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGScript {

	
	@Test(priority=1,description="This test case will verify login functionality")
	public void loginApplication(){
		System.out.println("hey This is my first test");
		Assert.assertEquals(12, 13);;
		
	}
	
	@Test(priority=2,description="this test case will add certain items in the basket")
	public void selectedItem(){
		System.out.println("Item selected");
		
	}
	
	@Test(priority=3,description="this test case will perform checkout operation")
	public void chcekOut(){
		System.out.println("Checkout completed");
		
	}
	
	
}
