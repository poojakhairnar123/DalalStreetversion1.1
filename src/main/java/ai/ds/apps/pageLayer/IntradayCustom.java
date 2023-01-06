package ai.ds.apps.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.apps.testBase.TestBase;

public class IntradayCustom extends TestBase {
	
	public IntradayCustom() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='active nav-link']")
	private WebElement buy_button1;
		
	@FindBy(xpath="//label[contains(text(),'Intraday')]")
	private WebElement intraday;
	
	@FindBy(xpath="(//label[@class='btn btn-outline-secondary'])[4]")
	private WebElement Custom;
	
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	private WebElement Qnty_TextBox;
	
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_button2;
	
	@FindBy(xpath="//div[contains(text(),'Limit Order Created Successfully')]")
	private WebElement Success1;
	
	
	public void clickOnBuy_button1() {
		buy_button1.click();
	}
    public void clickOnintraday() {
    	intraday.click();
	}
     public void clickOnCustom() {
    	 Custom.click();
     }
    public void enterQnty() {
    	Qnty_TextBox.sendKeys("4");
	
     }
    public void clickOnBuy_button2() {
		buy_button2.click();
	}
    public String getstatus1 () {
		
    	String s=Success1.getText();
    		return s;
    		
    	}


}
