package learning;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LearnWebView extends GenericWrappers {

	@Test
	public void runTC() throws MalformedURLException {
		launchIosApp("my device", "00008020-001A656C1105002E", "GJZCQ6TB82", "com.example.apple-samplecode.UICatalog",
				"");
		sleep(3000);
		scrollFromDownToUpinAppUsingTouchActions();
		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Web View"));
		sleep(3000);
		printContext();
		switchWebview();
		click(getWebElement(Locators.XPATH.toString(), "//a[@aria-label=\"Learn more about iPad Pro\"]"));
		sleep(3000);

	}
}
