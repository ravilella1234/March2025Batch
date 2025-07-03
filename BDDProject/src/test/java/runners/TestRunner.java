package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="tes/resources/features",
				 glue={"steps","hooks"},
		         plugin= {"pretty",
						  "html:target/html-Report.html",
						  "json:target/json-Report.json"
						 },
				 dryRun = false
				 //@dev, @ignore, @wip, @smoke, @regression etc...
				 /*
				  * tags = "@SmokeTest or @Sanity or @Regression" – (Running Scenarios with at Least One Tag)
					tags = "@SmokeTest and @Regression" - (More Than One Required)
					tags = "(@SmokeTest or @Sanity or @Regression) and not @WIP" - (At Least One Tag, But Exclude Some)
					tags = "(@SmokeTest or @Sanity) and not @WIP" – (Run either smoke or sanity tests, but skip WIP ones)
					tags ="@all and not @dev and not @wip and not @ignore" – (Run @all scenarios and exclude those tagged with @WIP)

				  */
				 
				 //tags = "@all and not @wip and not @dev" 
                )
public class TestRunner 
{

}
