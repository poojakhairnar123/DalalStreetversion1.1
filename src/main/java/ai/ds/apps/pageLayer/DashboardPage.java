package ai.ds.apps.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.apps.testBase.TestBase;

public class DashboardPage extends TestBase{

	public DashboardPage() {
		
		PageFactory.initElements(driver,this);
	}
	//object repository ------------------------------------------------//
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement Sarch_btn;
	
	@FindBy(xpath="(//div[@class='m-4 card'])[2]")
	private WebElement option;
	

	

	public void enterCompanyName(String Company_name) {
		Sarch_btn.sendKeys(Company_name);
		}
	public void selectOption() {
		option.click();
	}
  
}
