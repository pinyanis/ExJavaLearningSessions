package MyTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcases {
	
	//hard assertion ; hard validation ; if test assertion is getting failed -- > immediately test caase will be marked as failed and test case will be terminated
	//soft assertion ; soft validation ; if soft assertion is getting failed --> test case will not be marked as passed as well as next lines will be executed
	//assertAll(); to maerk the test as failed , if any soft assertion is getting failed.
	

	SoftAssert softAssert = new SoftAssert();
	
	
	@Test
	public void test1() {
		
		SoftAssert softAssert1 = new SoftAssert();
		
		System.out.println("Open Browser");
		Assert.assertEquals(true , true);
		
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click on sign in button");
		
		Assert.assertEquals(true, true);
		
		System.out.println("validate Home Page");
		softAssert1.assertEquals(true, false, "home page title is missing"); //soft assertion
		
		System.out.println("go to deal page");
		System.out.println("create a deal");
		softAssert1.assertEquals(true, false, "not able to create a deal"); // soft assertion
		
		System.out.println("go to contacts page");
		System.out.println("create a contact");
		softAssert1.assertEquals(true, false, "not able to create a contact"); // soft assertion
		
		softAssert1.assertAll();
		
		
	}
	
		@Test
		public void test2() {
			System.out.println("logout");
			softAssert.assertEquals(true, false);
			softAssert.assertAll();
			
		
		}
	
		@AfterClass
		public void tearDown(){
			
		}
	
	
}
