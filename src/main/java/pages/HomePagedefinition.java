package pages;



import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Then;
import wrappers.AppSpecificWrapper;

public class HomePagedefinition extends AppSpecificWrapper {

	public HomePagedefinition(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	public HomePagedefinition() {
		super();
	
	}
	HomePage page = new HomePage(driver);
	 
	

	@Then("^home related page open$")
	public void home_related_page_open() throws Throwable {
		page.fetchParName();
	}


@Given("^the user enter valied credential emial as \"([^\"]*)\" and password as \"([^\"]*)\"$")
public void the_user_enter_valied_credential_emial_as_and_password_as(String arg1, String arg2) throws Throwable {
    
}

@When("^the user clicked login which is designed under the password test field$")
public void the_user_clicked_login_which_is_designed_under_the_password_test_field() throws Throwable {
    
}


}
