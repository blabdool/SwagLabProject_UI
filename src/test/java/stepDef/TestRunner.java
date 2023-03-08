package stepDef;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/feature_files", monochrome = true,
        plugin = { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber-report.json",
                "junit:target/cucumber.xml"},
        tags = "@Regression")
public class TestRunner {
}
