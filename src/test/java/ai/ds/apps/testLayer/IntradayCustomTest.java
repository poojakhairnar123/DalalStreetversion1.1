package ai.ds.apps.testLayer;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import ai.ds.apps.pageLayer.DashboardPage;
import ai.ds.apps.pageLayer.IntradayCustom;
import ai.ds.apps.testBase.TestBase;

public class IntradayCustomTest extends TestBase {
	
	@Test
	public void verifyIntradayCustom() throws InterruptedException {
		 DashboardPage dash =new DashboardPage();
		 dash.enterCompanyName("wipro");
		 dash.selectOption();
		 
		 Thread.sleep(3000);
		 
		 IntradayCustom intra=new IntradayCustom();
		 intra.clickOnBuy_button1();
		 intra.clickOnintraday();
		 intra.clickOnCustom();
		 intra.enterQnty();
		 logger.info("intraday custom option selected ");
		
		 JavascriptExecutor js=  ((JavascriptExecutor)driver);
		 js.executeScript("scrollBy(0,300)");
		 
		 Thread.sleep(5000);
		 
		 intra.clickOnBuy_button2();
		 
		 logger.info("buy shared ");
		 
		
		 String Expected_Result="Limit Order Created Successfully";
		 
		 
		 Thread.sleep(3000);
		 
		 Assert.assertEquals(intra.getstatus1(),Expected_Result);
		 logger.info("Assersion passed");
		 
		
	} 
	
	
}
