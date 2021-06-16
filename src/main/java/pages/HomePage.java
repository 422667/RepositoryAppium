package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Then;
import wrappers.AppSpecificWrapper;

public class HomePage extends AppSpecificWrapper {

	public HomePage(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
	}
	
	public HomePage(AppiumDriver<WebElement> driver) {
		this.driver = driver;
		
	}


	public HomePage fetchParName() {
		if(verifyText(getWebElement("xpath", "//label[text()=' PARTICIPANT NAME ']/preceding-sibling::label"), "Gopi"))
			reportStep("The Element Gopi verified Successfully", "PASS");
		else
			reportStep("The Element not returns the text", "FAIL");
		return this;
	}



}
