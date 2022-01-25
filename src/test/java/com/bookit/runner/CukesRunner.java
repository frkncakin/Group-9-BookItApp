package com.bookit.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt", // store failed scenerio names into rerun.txt file
                "json:target/cucumber.json" // generate json execution report to be used for html report
        },
        features = "src/test/resources/features",
        glue = "com/bookit/steps",
        dryRun = false , // it allows us to run the feature files to get the snippets
        tags = "@ui"
)
public class CukesRunner {


}
