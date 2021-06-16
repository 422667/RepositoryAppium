package learning;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

public class PracticeSauceLabs {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("appiumVersion", "1.20.1");
		caps.setCapability("deviceName", "iPhone XS Max Simulator");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("platformVersion", "14.3");
		caps.setCapability("platformName", "iOS");
		caps.setCapability("app", "storage:filename=UICatalog.zip");
		IOSDriver<WebElement> driver = new IOSDriver<WebElement>(new URL(
				"https://lokeshappium:33083c0f-a113-4a84-b8c2-f98b782f40da@ondemand.us-west-1.saucelabs.com:443/wd/hub"),
				caps);
		driver.findElementByAccessibilityId("Action Sheets").click();
		driver.findElementByAccessibilityId("Okay / Cancel").click();
		driver.findElementByAccessibilityId("OK").click();

	}

}
