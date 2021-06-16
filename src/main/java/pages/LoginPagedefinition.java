package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import wrappers.AppSpecificWrapper;

public class LoginPagedefinition extends AppSpecificWrapper{
	
	public LoginPagedefinition(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
	}
	public LoginPagedefinition() {
		super();
	
	}
	LoginPage page = new LoginPage(driver);
	 

	@When("the user clicked login which is designed under the password test field")
	public HomePage clickLogin() {
		if(click(getWebElement("xpath", "//span[text()='Login']"))) {
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			reportStep("Login button clicked successfully", "PASS");
		}
		else
			reportStep("Login button couldn't click", "FAIL");
		return new HomePage(driver, test);
	}
	
	@Given("the user enter valied credential emial as {} and password as {}")
	public void enterValidCredential(String email, String pwd) {
		page.enterEmailAddress(email);
		page.enterPassword(pwd);
	}

}
