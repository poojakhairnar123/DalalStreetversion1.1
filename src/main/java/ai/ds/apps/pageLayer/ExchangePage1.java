package ai.ds.apps.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.apps.testBase.TestBase;

public class ExchangePage1 extends TestBase {
	
	public  ExchangePage1() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='active nav-link']")
	private WebElement BuyButton1;
	
	@FindBy(xpath="(//label[@class='btn btn-outline-secondary'])[2]")
	private WebElement Intraday;
	
	@FindBy(xpath="(//label[@class='btn btn-outline-secondary'])[3]")
	private WebElement market;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement Qnty;
	
	@FindBy(xpath="//button[@class='w-md btn btn-success']")
	private WebElement BuyButton2;
	

	@FindBy(xpath="//div[contains(text(),'Order Created Successfully')]")
	private WebElement Success;
	
	
	
	
	public void clickOnBuyButton1() {
		BuyButton1.click();
	}
	public void clickOnIntraday() {
		Intraday.click();
	}

	public void clickOnmarket() {
		market.click();
	}

	public void enterQnty() {
		Qnty.click();
		Qnty.sendKeys("3");
	}
	public void clickOnBuyButton2() {
		BuyButton2.click();
		
	}
	public String getstatus () {
		
	String s=Success.getText();
		return s;
		
	}



}
