package pages;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.listener.Reporter;



import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.UserData;
import wrappers.AppSpecificWrapper;
import utils.CsvDataReader;
import utils.UserPortal;



public class Hooks extends AppSpecificWrapper{
	
	
	public static Scenario scenario;

	
	@Before
	public void launchDriver(Scenario scenario) throws Throwable {
		

		Hooks.scenario = scenario;


		
	}

	@Before
	public void loadTestData() {
		UserPortal.loadCredentials(CsvDataReader.readFile());
	
	}

	
	
	@After
	public void killDriver() throws IOException {
		
		

			
		
		if(scenario.isFailed()) {
			
		 Reporter.addScreenCaptureFromPath(getScreenshot());
		 final byte[] screenshot = ((TakesScreenshot)
		 driver).getScreenshotAs(OutputType.BYTES); Hooks.scenario.embed(screenshot,
		"image/jpeg"); 
		 
	
		} 
		//driver.quit(); 
		 
	}
	
	
}

