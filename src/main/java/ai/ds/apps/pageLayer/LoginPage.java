package ai.ds.apps.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ai.ds.apps.testBase.TestBase;

public class LoginPage extends TestBase {  //Inherit TestBase class and import.
	
	public LoginPage()        //Write Constructor
	    {                  
		PageFactory.initElements(driver,this); 
		}
	
	//___________________Create Object Repository(global variable and initlization)_____________________________//
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement Email_txtbox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password_txtbox;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement login_btn;
	
	//___________________Create Action Method(usage)_________________________________//
	
	public void enterEmailID (String EmaiId) {
		Email_txtbox.sendKeys(EmaiId);         //Enter mailId
		
	}
	public void enterPassword(String password) {
		 Password_txtbox.sendKeys(password);
	}
	public void clickOnLoginBtn() {
		login_btn.click();                //Enter Password
	}
	public String getCUrl() {
              String url = driver.getCurrentUrl();               //Enter Password
		      return url;
		
	}
	

}
