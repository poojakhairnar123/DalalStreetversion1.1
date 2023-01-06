package ai.ds.apps.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import ai.ds.apps.pageLayer.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public LoginPage login;
	public static Logger logger;
	public static WebDriver driver;  // driver Declared as global variable declared
	
	@BeforeClass
	public void start(){
    logger =Logger.getLogger("DalalStreet Framework");
	PropertyConfigurator.configure("Log4jCode.properties");
	logger.info("FrameWork Execution started");
	
	}
	
    @AfterClass
    public void end(){
    	logger.info("FrameWork Execution stopped");
    	
	
    }
	
	
	
	
	
	@Parameters ("Browser")
	@BeforeMethod
	public void setup(String br) throws InterruptedException {
		//String br="chrome";
		if(br.equalsIgnoreCase("chrome")) {
	    WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edage")) {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		}
		else {
			System.out.println("please provide current browser");
		}
    driver.get("https://apps.dalalstreet.ai/login");
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  
    logger.info("Browser lounches,url hit,window maximize");
	
    
    
     login = new LoginPage();
     logger.info("login object created");
 	
     
     login.enterEmailID("pkhairnar990@gmail.com");
	 login.enterPassword("Pooja@1234");
	 login.clickOnLoginBtn();
	 Thread.sleep(4000);
	 logger.info("logged in");
	 	
    }
   
	@AfterMethod
    public void tearDown() {
  //  driver.quit();
		 logger.info("Browser closed");
		 	
	 }
	   

}
