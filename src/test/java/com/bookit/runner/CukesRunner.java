package com.bookit.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt", // store failed scenario names into rerun.txt file
                "json:target/cucumber.json" // generate json execution report to be used for html report
        },
        features = "src/test/resources/features",
        glue = "com/bookit/steps",
        dryRun = true,
        tags = "@wip"
)
public class CukesRunner {
}
