package ai.ds.apps.testLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import ai.ds.apps.pageLayer.DashboardPage;
import ai.ds.apps.pageLayer.ExchangePage;
import ai.ds.apps.pageLayer.LoginPage;
import ai.ds.apps.testBase.TestBase;

public class BuyFunctioallity extends TestBase{

	@Test
	public void verifyBuyFunctioallity() throws InterruptedException{
		
		 String Expected_Result="Order Created successfully";
		 
		 DashboardPage dash =new DashboardPage();
		 dash.enterCompanyName("wipro");
		 dash.selectOption();
		 logger.info("Sarch and selected Company option");
		
		 Thread.sleep(4000);
		 
		 ExchangePage exchange =new ExchangePage();
		 exchange.clickOnbuy_button1();
		 exchange.enterQnty();
		 
		 JavascriptExecutor js =(JavascriptExecutor) driver;  //TYPECASTING
	     js.executeScript("scrollBy(0,200)");    //SD
	     Thread.sleep(4000);
	      
		 exchange.clickOnbuy_button2();
		 logger.info("buy share");
			
		 
		 Thread.sleep(5000);
		 Assert.assertEquals(exchange.getstatus(), Expected_Result);  
		 
		 Thread.sleep(6000);
		
	}
}
