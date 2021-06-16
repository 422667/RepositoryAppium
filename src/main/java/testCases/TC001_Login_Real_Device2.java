package testCases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.AppSpecificWrapper2;

public class TC001_Login_Real_Device2 extends AppSpecificWrapper2 {

	@Test()
	public void login() {
		testCaseName = "TC001_Login";
		testDescription = "Login in LeafOrg App";
		testNodes = "TC001";
		authors = "Gopinath Jayakumar";
		category = "Smoke";
		startTestModule(testCaseName, testDescription);
		startTestCase(testNodes);
		new LoginPage(driver, test).enterEmailAddress("rajkumar@testleaf.com").enterPassword("Leaf@123").clickLogin()
				.fetchParName();
	}

	@Test()
	public void login2() {
		testCaseName = "TC002_Login";
		testDescription = "Login in LeafOrg App";
		testNodes = "TC002";
		authors = "Gopinath Jayakumar";
		category = "Smoke";
		startTestModule(testCaseName, testDescription);
		startTestCase(testNodes);
		new LoginPage(driver, test).enterEmailAddress("rajkumar@testleaf.com").enterPassword("Leaf@123").clickLogin()
				.fetchParName();
	}

	@Test()
	public void login3() {
		testCaseName = "TC003_Login";
		testDescription = "Login in LeafOrg App";
		testNodes = "TC003";
		authors = "Gopinath Jayakumar";
		category = "Smoke";
		startTestModule(testCaseName, testDescription);
		startTestCase(testNodes);
		new LoginPage(driver, test).enterEmailAddress("rajkumar@testleaf.com").enterPassword("Leaf@123").clickLogin()
				.fetchParName();
	}

}
