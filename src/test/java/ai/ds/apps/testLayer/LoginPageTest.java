package ai.ds.apps.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.ds.apps.pageLayer.LoginPage;
import ai.ds.apps.testBase.TestBase;

public class LoginPageTest extends 	TestBase{

	@Test
	public void verifyLogin() throws InterruptedException {
		String Expected_result="https://apps.dalalstreet.ai/dashboard";
		
		 
		 Thread.sleep(4000);
		 String Actual_Results=login.getCUrl();
		 System.out.println(Actual_Results);
		 
		 Assert.assertEquals(Actual_Results, Expected_result);
		 
		 logger.info("login asserion passed ");
	}
}
