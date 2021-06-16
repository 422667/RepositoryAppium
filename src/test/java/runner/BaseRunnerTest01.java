package runner;

import java.io.File;
import java.util.Optional;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        tags = {
                "~@ignore","~@Ref","@test" 
               },
        glue = {"pages", "src/test/resources/snippet"},
        monochrome = true,
        strict = true,
        plugin = {"pretty", "html:target/cucumber-html-reports",
        		  "com.cucumber.listener.ExtentCucumberFormatter:",
        		  "json:target/cucumber-reports/Cucumber.json"})

public class BaseRunnerTest01 {
	@AfterClass
	 public static void writeExtentReport() {
		 Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
		     Reporter.setSystemInfo("User Name", "Zuellig");
		     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		     Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		     Reporter.setSystemInfo("Selenium", "3.7.0");
		     Reporter.setSystemInfo("Maven", "3.5.2");
		     Reporter.setSystemInfo("Java Version", "1.8.0_231");
		
		    
		 }
	 }

	

