package ai.ds.apps.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import ai.ds.apps.testBase.TestBase;

public class ScreenShots extends TestBase {
	
	
	public ScreenShots() {
		PageFactory.initElements( driver,this);
	}
	
	public static void getScreenShot(String FileName) throws IOException {
		
		TakesScreenshot ts=((TakesScreenshot)driver);
		
		File Source=ts.getScreenshotAs(OutputType.FILE);
		
		String path="C:\\Users\\HP\\eclipse-workspace\\Dalalstreet\\ScreenShot\\";
		
		File Dest=new File(path+FileName+".png");
		
		FileHandler.copy(Source,Dest);
		
		
		
	}

}
