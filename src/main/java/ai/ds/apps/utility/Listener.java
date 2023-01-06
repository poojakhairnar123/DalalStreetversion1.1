package ai.ds.apps.utility;

import java.io.IOException;


import org.testng.ITestListener;
import org.testng.ITestResult;

import ai.ds.apps.testBase.TestBase;

public class Listener extends TestBase implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		
		logger.info("Test Execution Started" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test Execution complited" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test Execution failed" + result.getName());
		
		try {
			ScreenShots.getScreenShot(result.getName()+System.currentTimeMillis());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info("ScreenShot");
	}
		

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test Execution Skipped" + result.getName());
	}

	
}
