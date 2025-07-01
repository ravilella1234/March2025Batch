package com.project;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/project",
				 glue="com/project",
		         plugin= {"pretty",
						  "html:target/html-Report.html",
						  "json:target/json-Report.json"
						 },
				 dryRun = false,
				 tags = "@all"
                )
public class TestRunner 
{

}
