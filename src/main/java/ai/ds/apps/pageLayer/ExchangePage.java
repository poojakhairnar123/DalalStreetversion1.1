package ai.ds.apps.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.apps.testBase.TestBase;

public class ExchangePage extends TestBase {
	
	public ExchangePage() {
		PageFactory.initElements( driver,this);
	}
//	-----------------------object repository---------------------
	@FindBy(xpath="//a[@class='active nav-link']")
	private WebElement buy_button1;
	
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	private WebElement Qnty_TextBox;
	
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_button2;
	
	@FindBy(xpath="//div[contains(text(),'Order Created successfully')]")
	private WebElement Suc;
	
	public void clickOnbuy_button1() {
		buy_button1.click();
	}
    public void enterQnty() {
    	Qnty_TextBox.click();
    	Qnty_TextBox.sendKeys("3");
	}
   public void clickOnbuy_button2() {
	   buy_button2.click();
	}
   public String getstatus () {
		
   	String s=Suc.getText();
   		return s;
   		
   	}

}
