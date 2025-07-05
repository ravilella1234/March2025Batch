package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/parallel/ContactUs.feature"},
		glue = {"parallel"},
		plugin = {"pretty",
				    "html:target/htmlreport.html"
				 }
		
		)

public class MyTestRunner {

}
