package learning;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class UiCatlog extends GenericWrappers {

	@Test
	public void runTC() throws MalformedURLException {
//		launchIosApp("iPhone 12 Pro Max Simulator", "BA6EE8F1-71BA-4B0C-9AC8-41B4AAA7CF36", "", "",
//				"/app/UICatalog.zip");

//		launchIosApp("iPhone 12 Pro Max Simulator", "BA6EE8F1-71BA-4B0C-9AC8-41B4AAA7CF36", "",
//				"com.example.apple-samplecode.UICatalog", "");
		
		launchIosApp("my device", "00008020-001A656C1105002E", "GJZCQ6TB82",
				"com.example.apple-samplecode.UICatalog", "");
		
		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Action Sheets"));
		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Okay / Cancel"));
		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "OK"));

	}

}
