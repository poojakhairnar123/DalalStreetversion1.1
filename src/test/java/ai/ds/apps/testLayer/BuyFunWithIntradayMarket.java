package ai.ds.apps.testLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import ai.ds.apps.pageLayer.DashboardPage;
import ai.ds.apps.pageLayer.ExchangePage1;
import ai.ds.apps.testBase.TestBase;

public class BuyFunWithIntradayMarket extends TestBase {
	
	@Test
	public void verifyBuyIntradayMarket() throws InterruptedException {
		
		
		 String Expected_Result="Order Created Successfully";
		 
		 DashboardPage dash =new DashboardPage();
		 dash.enterCompanyName("wipro");
		 dash.selectOption();
		
		 Thread.sleep(4000);
		 
		 ExchangePage1 exchange1=new ExchangePage1();
		 exchange1.clickOnBuyButton1();
		 exchange1.clickOnIntraday();
		 exchange1.clickOnmarket();
		 exchange1.enterQnty();
		 
		 logger.info("Intraday selected & market  ");
			
		 
		 JavascriptExecutor js=  ((JavascriptExecutor)driver);
		 js.executeScript("scrollBy(0,300)");
		 
		 Thread.sleep(3000);
		 exchange1.clickOnBuyButton2();
		 
		 logger.info("buy share ");
		 
		 
		 Thread.sleep(3000);
		 Assert.assertEquals(exchange1.getstatus(), Expected_Result);  
		 
		 Thread.sleep(3000);	
		 
		 logger.info("Assortion pass");
		
	}
}
