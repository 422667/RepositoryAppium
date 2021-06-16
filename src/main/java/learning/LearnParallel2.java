package learning;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LearnParallel2 extends GenericWrappers {

	@Test
	public void runTC() throws MalformedURLException {

		launchIosAppInParallel("iPhone 12 Pro Max Simulator", "BA6EE8F1-71BA-4B0C-9AC8-41B4AAA7CF36", "",
				"com.example.apple-samplecode.UICatalog", "","8901");

		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Picker View"));
		enterValue(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Red color component value"), "100");
		enterValue(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Green color component value"), "50");
		enterValue(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Blue color component value"), "70");
		for (int i = 0; i < 10; i++) {

			chooseNextOptionInPickerWheel(
					getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Red color component value"));
		}

	}

}
